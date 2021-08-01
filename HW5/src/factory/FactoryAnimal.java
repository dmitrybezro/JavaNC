package factory;

import animals.*;
import model.Animal;
import model.Species;

import peripherals.Data;

public class FactoryAnimal {
    public Animal create(Data data) {
        AnimalImpl animal = null;
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.GIRAFFE.name())) {
            animal = new Giraffe(new AnimalImpl.AnimalBuilder().name(data.getNameAnimal()));
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.LEON.name())) {
            animal = new Leon(new AnimalImpl.AnimalBuilder().name(data.getNameAnimal()));
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.PENGUIN.name())) {
            animal = new Penguin(new AnimalImpl.AnimalBuilder().name(data.getNameAnimal()));
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.SQUIRREL.name())) {
            animal = new Squirrel(new AnimalImpl.AnimalBuilder().name(data.getNameAnimal()));
        }
        return animal;
    }
}
