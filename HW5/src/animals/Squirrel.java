package animals;

import model.Animal;
import model.Nutrition;
import model.Species;
//  Дописать исключения в конструктор
public class Squirrel implements Animal {
    private final String name;
    private double height;
    private double weight;
    private int age;
    private int numberCage;
    private final Nutrition NUTRITION = Nutrition.OMNIVOROUS;

    public Squirrel(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    public Squirrel(String name) {
        this.name = name;
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

    public Nutrition getNutrition() {
        return this.NUTRITION;
    }

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
        return Species.SQUIRREL;
    }
}
