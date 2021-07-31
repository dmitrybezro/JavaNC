package factory;

import animals.*;
import model.Animal;
import model.Species;

import peripherals.Data;

public class FactoryAnimal {
    public Animal create(Data data) {
        AnimalImpl animal = null;
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.GIRAFFE.name())) {
            animal = new Giraffe(new AnimalImpl.AnimalBuilder().name("str"));
        }

/*        if (data.getSpecieAnimal().equalsIgnoreCase(Species.GIRAFFE.name())) {
           animal = new Giraffe(data.getNameAnimal());
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.LEON.name())) {
            animal = new Leon(data.getNameAnimal());
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.PENGUIN.name())) {
            animal = new Penguin(data.getNameAnimal());
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.SQUIRREL.name())) {
            animal = new Squirrel(data.getNameAnimal());
        }*/

        return animal;
    }
}
