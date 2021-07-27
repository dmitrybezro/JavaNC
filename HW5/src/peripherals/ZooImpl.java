package peripherals;

import animals.Giraffe;
import animals.Squirrel;
import cages.CageImpl;
import model.Animal;
import model.Species;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ZooImpl implements Zoo {
    private final int numberAnimal = 4;
    private final ArrayList<CageImpl> cages = new ArrayList<>(numberAnimal);
    private ArrayList<Animal> animals = new ArrayList<Animal>(numberAnimal);
    private ArrayList<InhibitionLog> journal = new ArrayList<>();


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
    public void checkInAnimal(Animal animal) {
        //  Проверить все клетки
        Species speciesAnimal = animal.getSpecies();
        for(CageImpl cage : cages){

            boolean vacant = cage.isVacantCage();  //  Проверка вакантности клетки

            List<Species> list = cage.getCondition().isAvailableFor();  //  Типы животных для клетки
            int indexCage = list.indexOf(speciesAnimal);  //  Индекс первой доступной клетки

            if (indexCage >= 0 && vacant) {
                cage.setVacant(false);  //  Установили вакантность
                animals.set(indexCage, animal);  //  Добавили животное

                //  Занести запись в дату заезда
                cage.setInDate(new Date());
              //  journal.add(new peripherals.InhibitionLog(new Date(), null, animal.getSpecies(), animal.getName() ));
                System.out.println("Accept");
                break;
            } else {
                if(cage.equals(cages.get(numberAnimal - 1))) {
                    //  Исключение некуда принять
                    System.out.println("Not accept");
                }
            }
        }

    }

    @Override
    public void checkOutAnimal(Animal animal) {
        //  Если в каком-то есть уже такое же имя

        for(int i = 0; i < animals.size(); i++){
            Animal animalInZoo = animals.get(i);
            if(animalInZoo != null && animalInZoo.getName().equals(animal.getName())){
                cages.get(i).setVacant(true);  //  Установили вакантность
                animals.set(i, null);
                journal.add(new InhibitionLog(cages.get(i).getInDate(),
                        new Date(), animal.getSpecies(), animal.getName()));
                System.out.println("Evicted");
                break;
            } else {
                if(i == numberAnimal - 1){
                    //  Исключение о ненахождении животного
                    System.out.println("Not evict");
                }
            }
        }
       /* int indexCage = animals.indexOf(animal);

        if(indexCage >= 0) {
            cages.get(indexCage).setVacant(true);  //  Установили вакантность
            animals.set(indexCage, null);
            //  Запись в журнал при выселении. Даты из клетки
            journal.add(new InhibitionLog(cages.get(indexCage).getInDate(),
                        new Date(), animal.getSpecies(), animal.getName()));
            System.out.println("Evicted");
           // break;
        } else {
                //  Исключение о ненахождении животного
                System.out.println("Not evict");
        }*/
    }

    @Override
    public List<InhibitionLog> getHistory() {
        return journal;
    }

    public static void main(String[] args) {
        ZooImpl zoo = new ZooImpl();
        Giraffe giraffe = new Giraffe("A");
        Giraffe giraffe2 = new Giraffe("B");
        Squirrel squirrel = new Squirrel("S");

        zoo.checkInAnimal(giraffe);
        zoo.checkInAnimal(giraffe2);
      //  zoo.checkInAnimal(giraffe2);
       /* zoo.checkOutAnimal(giraffe);
        zoo.checkInAnimal(squirrel);
        zoo.checkOutAnimal(squirrel);*/

       // List<InhibitionLog> logs = zoo.getHistory();

/*        for(InhibitionLog log : logs) {
            System.out.println(log.toString());
        }*/

       // System.out.println(zoo.getHistory());
    }
}
