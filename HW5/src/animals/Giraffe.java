package animals;

import model.Animal;
import model.Nutrition;
import model.Species;

public class Giraffe extends AnimalImpl {
/*    private String name;
    private double height;
    private double weight;
    private int age;*/
    private int numberCage;
    private final Nutrition NUTRITION = Nutrition.HERBIVORE;

    public Giraffe(AnimalBuilder animalBuilder){
        super(animalBuilder);
    }

/*    public Giraffe(String name, double height, double weight, int age){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

   public Giraffe(String name) {
        this.name = name;
    }*/

/*    public double getHeight() {
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
    }*/

    public Nutrition getNutrition() {
        return this.NUTRITION;
    }

/*    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public int getNumberCage() {return this.numberCage;}

    public void setNumberCage(int number) {
        this.numberCage = number;
    }

/*    @Override
    public String getName() {
        return this.name;
    }*/

    @Override
    public Species getSpecies() {
        return Species.GIRAFFE;
    }

    public static void main(String[] args) {
        Giraffe giraffe = new Giraffe(new AnimalImpl.AnimalBuilder().name("str"));
        System.out.println(giraffe.getName());
    }
}
