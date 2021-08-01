package animals;

import model.Animal;
import model.Nutrition;
import model.Species;

public class Penguin extends AnimalImpl {
    private int numberCage;
    private final Nutrition NUTRITION = Nutrition.CARNIVOROUS;

    public Penguin(AnimalBuilder animalBuilder){
        super(animalBuilder);
    }

    public Nutrition getNutrition() {
        return this.NUTRITION;
    }

    public int getNumberCage() {return this.numberCage;}

    public void setNumberCage(int number) {
        this.numberCage = number;
    }

    @Override
    public Species getSpecies() {
        return Species.PENGUIN;
    }

}
