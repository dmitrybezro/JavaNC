package animals;

import model.Animal;
import model.Nutrition;
import model.Species;

public class  AnimalImpl implements Animal {
    private final String name;
    private double height;
    private double weight;
    private int age;
    private int numberCage;
    //private final Nutrition NUTRITION;

    protected AnimalImpl(AnimalBuilder animalBuilder){
        //  Исключения для отрицательных значений

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

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

/*    public Nutrition getNutrition() {
        return this.NUTRITION;
    }*/

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberCage() {return this.numberCage;}

    public void setNumberCage(int number) {
        this.numberCage = number;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Species getSpecies() {
        return null;
    }

    //  Статистический вложенный класс строитель
    public static class AnimalBuilder {
        private String name;
        private double height;
        private double weight;
        private int age;
        private int numberCage;


        public AnimalBuilder(){
            super();
        }

        public AnimalBuilder name(String name){
            this.name = name;
            return this;
        }

        public AnimalBuilder height(double height){
            this.height = height;
            return this;
        }

        public AnimalBuilder weight(double weight){
            this.weight = weight;
            return this;
        }

        public AnimalBuilder age(int age){
            this.age = age;
            return this;
        }

        public AnimalImpl build(){
            return new AnimalImpl(this);
        }
    }
}
