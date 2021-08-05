package peripherals;

import cages.CageImpl;
import exceptions.NoFreeCageException;
import exceptions.NoRequestedAnimalException;
import model.Animal;
import model.Species;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZooImpl implements Zoo {
    private final int numberAnimal = 4;
    private final ArrayList<CageImpl> cages = new ArrayList<>(numberAnimal);
    private ArrayList<Animal> animals = new ArrayList<Animal>(numberAnimal);
    private Logging logger = new Logging();

    public ZooImpl() {
        this.cages.add(new CageImpl(2, 4));
        this.cages.add(new CageImpl(4, 3));
        this.cages.add(new CageImpl(4, 5));
        this.cages.add(new CageImpl(3, 9));
        for(int i = 0; i < numberAnimal; i++) {
            animals.add(null);
        }
    }
    
    @Override
    public void checkInAnimal(Animal animal) throws NoFreeCageException{
        Species speciesAnimal = animal.getSpecies();
        for(CageImpl cage : cages){

            boolean vacant = cage.isVacantCage();

            List<Species> list = cage.getCondition().isAvailableFor();
            int indexCage = list.indexOf(speciesAnimal);

            if (indexCage >= 0 && vacant) {
                cage.setVacant(false);
                animals.set(indexCage, animal);
                cage.setInDate(new Date());
                logger.accept();
                break;
            } else {
                if(cage.equals(cages.get(numberAnimal - 1))) {
                    throw new NoFreeCageException("The animal is not accepted. There are no free cages");
                }
            }
        }
    }

    @Override
    public void checkOutAnimal(Animal animal) throws NoRequestedAnimalException{
        for(int i = 0; i < animals.size(); i++){
            Animal animalInZoo = animals.get(i);
            if(animalInZoo != null && animalInZoo.getName().equals(animal.getName())){
                cages.get(i).setVacant(true);
                animals.set(i, null);
                logger.add(new InhibitionLog(cages.get(i).getInDate(),
                        new Date(), animal.getSpecies(), animal.getName()));
                logger.evicted();
                break;
            } else {
                if(i == (numberAnimal - 1)){
                    throw new NoRequestedAnimalException("The animal has not been removed. There is no suitable one.");
                }
            }
        }

    }

    @Override
    public List<InhibitionLog> getHistory() {
        return logger.getJournal();
    }
}
