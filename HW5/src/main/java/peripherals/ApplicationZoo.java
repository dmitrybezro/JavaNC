package peripherals;

import exceptions.NoFreeCageException;
import exceptions.NoRequestedAnimalException;
import factory.FactoryAnimal;
import model.Animal;

import java.util.List;
import java.util.Scanner;

public class ApplicationZoo {

    ZooImpl zoo = new ZooImpl();
    ParserCommand parser;

    public void start(){

        helpOutput();

        while(true) {
            Scanner in = new Scanner(System.in);
            Data data;
            Animal animal = null;
            boolean correctString;

            do {
                System.out.println("Enter the command");
                String stringInput = in.nextLine();
                parser = new ParserCommand(stringInput);
                correctString = parser.isCorrectString();
            } while (!correctString);

            data = parser.getData();

            if(data.getSize() > 1) {
                FactoryAnimal factoryAnimal = new FactoryAnimal();
                animal = factoryAnimal.create(data);
            }

            switch (data.getCommand().toLowerCase()){
                case "check-in":
                    try{
                        zoo.checkInAnimal(animal);
                    }
                    catch (NoFreeCageException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "check-out":
                    try {
                        zoo.checkOutAnimal(animal);
                    }
                    catch (NoRequestedAnimalException exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
                case "log":
                    logOutput();
                    break;
                case "help":
                    helpOutput();
                    break;
            }
        }
    }

    private void helpOutput(){
        System.out.println("Available commands");
        System.out.println("check-in <type of animal> <name of animal>" +
                " - add an animal to the zoo");
        System.out.println("check-out <type of animal> <name of animal>  " +
                "- remove an animal from the zoo");
        System.out.println("log - display the arrival-departure log");
        System.out.println("help - show help");
        System.out.println("the input is case-independent");
        System.out.println();
    }

    private void logOutput(){
        List<InhibitionLog> logs = zoo.getHistory();

        for (InhibitionLog log : logs) {
            System.out.println("Animal = " + log.getAnimalSpecies()
                    + " name = " + log.getAnimalName()
                    + " сheck-in date = " + log.getCheckInDate()
                    + " сheck-out date = " + log.getCheckOutDate());
        }
        if(logs.size() == 0) {
            System.out.println("The log is empty");
        }
    }

    private void UploadData(){
        //  Подгрузить данные из базы в классы
    }
}
