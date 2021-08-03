package animals;

import model.Nutrition;
import model.Species;

public class Giraffe extends AnimalImpl {
    private int numberCage;
    private final Nutrition NUTRITION = Nutrition.HERBIVORE;

    protected Giraffe(GiraffeBuilder animalBuilder){

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
        return Species.GIRAFFE;
    }

    public static class GiraffeBuilder {
        private String name;
        private double height;
        private double weight;
        private int age;
        private int numberCage;

        public GiraffeBuilder (){
            super();
        }

        public GiraffeBuilder name(String name){
            this.name = name;
            return this;
        }

        public GiraffeBuilder height(double height){
            this.height = height;
            return this;
        }

        public GiraffeBuilder weight(double weight){
            this.weight = weight;
            return this;
        }

        public GiraffeBuilder age(int age){
            this.age = age;
            return this;
        }

        public Giraffe build(){
            return new Giraffe(this);
        }
    }
}
