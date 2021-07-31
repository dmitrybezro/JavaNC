package peripherals;

import exceptions.NoFreeCageException;
import exceptions.NoRequestedAnimalException;
import model.Animal;
import model.Species;
import animals.*;

import java.util.List;
import java.util.Scanner;

public class ApplicationZoo {
    public void start(){
        Scanner in = new Scanner(System.in);
        ZooImpl zoo = new ZooImpl();
        helpOutput();

        //  Бесконечный ввод
        while(true) {

            Data data;
            Animal animal = null;
            boolean correctString;

            //  Повтор для корректности ввода
            do {
                System.out.println("Enter the command");
                correctString = true;
                String stringInput = in.nextLine();
                ParserCommand parser = new ParserCommand();

                data = parser.pars(stringInput);

                //  Отдельная проверка на команду log
                if(data.size == 1 && data.getCommand().equalsIgnoreCase( "log")){
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
                    correctString = false;

                }

                //  Проверка на команду help
                if(data.size == 1 && data.getCommand().equalsIgnoreCase( "help")) {
                    helpOutput();
                }

                //  Проверка корректности ввода команды
                if (!isCorrectCommand(data.getCommand()))
                    correctString = false;

                //  Корректность ввода вида животного
                if(correctString){
                    boolean correctSpecie = false;
                    if (data.getSpecieAnimal().equalsIgnoreCase(Species.GIRAFFE.name())) {
                        animal = new Giraffe(data.getNameAnimal());
                        correctSpecie = true;
                    }
                    if (data.getSpecieAnimal().equalsIgnoreCase(Species.LEON.name())) {
                        animal = new Leon(data.getNameAnimal());
                        correctSpecie = true;
                    }
                    if (data.getSpecieAnimal().equalsIgnoreCase(Species.PENGUIN.name())) {
                        animal = new Penguin(data.getNameAnimal());
                        correctSpecie = true;
                    }
                    if (data.getSpecieAnimal().equalsIgnoreCase(Species.SQUIRREL.name())) {
                        animal = new Squirrel(data.getNameAnimal());
                        correctSpecie = true;
                    }
                    if (!correctSpecie) {
                        correctString = false;
                    }
                }
                System.out.println();
            } while (!correctString);

            //  Если все ок, то вызываются функции зоопарка
            if (data.getCommand().equalsIgnoreCase("check-in")) {
                try{
                    zoo.checkInAnimal(animal);
                }
                catch (NoFreeCageException exception){
                    System.out.println(exception.getMessage());
                }

            }
            if (data.getCommand().equalsIgnoreCase("check-out")) {
                try {
                    zoo.checkOutAnimal(animal);
                }
                catch (NoRequestedAnimalException exception){
                    System.out.println(exception.getMessage());
                }

            }
            System.out.println();
        }
    }

    //  Функция проверки корректности команды
    //  Логирование обрабатывается отдельно
    private boolean isCorrectCommand(String command) {
        boolean result = true;

        switch (command.toLowerCase()){
            case "check-in" :
                //  Команда добавления из зоопарка
                break;
            case "check-out":
                //  Команда удаления из зоопарка
                break;
            default:
                result = false;
                break;
        }
        return result;
    }

    //  Вывод справки
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
}
