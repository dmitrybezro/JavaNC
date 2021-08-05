package animals;

import model.Nutrition;
import model.Species;

public class Squirrel extends AnimalImpl {
    private int numberCage;
    private final Nutrition NUTRITION = Nutrition.OMNIVOROUS;

    protected Squirrel(SquirrelBuilder animalBuilder){

        if (animalBuilder.name == null || animalBuilder.name.isEmpty()) {
            throw new IllegalArgumentException("Enter the name of the animal");
        }
        if (animalBuilder.height < 0) {
            throw new IllegalArgumentException("The animal's height must be greater than zero");
        }
        if (animalBuilder.weight < 0) {
            throw new IllegalArgumentException("The animal's weight must be greater than zero");
        }
        if (animalBuilder.age < 0) {
            throw new IllegalArgumentException("The animal's age must be greater than zero");
        }

        this.name = animalBuilder.name;
        this.height = animalBuilder.height;
        this.weight = animalBuilder.weight;
        this.age = animalBuilder.age;
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
        return Species.SQUIRREL;
    }

    public static class SquirrelBuilder {
        private String name;
        private double height;
        private double weight;
        private int age;
        private int numberCage;

        public SquirrelBuilder (){
            super();
        }

        public SquirrelBuilder name(String name){
            this.name = name;
            return this;
        }

        public SquirrelBuilder height(double height){
            this.height = height;
            return this;
        }

        public SquirrelBuilder weight(double weight){
            this.weight = weight;
            return this;
        }

        public SquirrelBuilder age(int age){
            this.age = age;
            return this;
        }

        public Squirrel build(){
            return new Squirrel(this);
        }
    }
}
