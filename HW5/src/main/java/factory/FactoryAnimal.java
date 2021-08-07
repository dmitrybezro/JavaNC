package factory;

import animals.*;
import model.Animal;
import model.Species;

import peripherals.Data;

public class FactoryAnimal {
    public Animal create(Data data) {
        AnimalImpl animal = null;
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.GIRAFFE.name())) {
            animal = new Giraffe.GiraffeBuilder().name(data.getNameAnimal()).build();
        }
      if (data.getSpecieAnimal().equalsIgnoreCase(Species.LEON.name())) {
            animal = new Leon.LeonBuilder().name(data.getNameAnimal()).build();
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.PENGUIN.name())) {
            animal = new Penguin.PenguinBuilder().name(data.getNameAnimal()).build();
        }
        if (data.getSpecieAnimal().equalsIgnoreCase(Species.SQUIRREL.name())) {
            animal = new Squirrel.SquirrelBuilder().name(data.getNameAnimal()).build();
        }
        return animal;
    }
}
