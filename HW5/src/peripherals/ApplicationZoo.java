package peripherals;

import model.Animal;
import model.Species;
import animals.*;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationZoo {
    public void start(){
        Scanner in = new Scanner(System.in);
        ZooImpl zoo = new ZooImpl();
        while(true) {
            System.out.println("Enter the command");
            String stringInput = in.nextLine();
            ParserCommand parser = new ParserCommand();

            Data data = parser.pars(stringInput);


            Animal animal = null;
            boolean correctString = true;
            do {
                //  Проверка корректности ввода команды
                if (!isCorrectCommand(data.command))
                    correctString = false;

                //  Корректность ввода вида животного
                {
                    boolean correctSpecie = false;
                    if (data.specieAnimal.equalsIgnoreCase(Species.GIRAFFE.name())) {
                        animal = new Giraffe(data.nameAnimal);
                        correctSpecie = true;
                    }
                    if (data.specieAnimal.equalsIgnoreCase(Species.LEON.name())) {
                        animal = new Leon(data.nameAnimal);
                        correctSpecie = true;
                    }
                    if (data.specieAnimal.equalsIgnoreCase(Species.PENGUIN.name())) {
                        animal = new Penguin(data.nameAnimal);
                        correctSpecie = true;
                    }
                    if (data.specieAnimal.equalsIgnoreCase(Species.SQUIRREL.name())) {
                        animal = new Squirrel(data.nameAnimal);
                        correctSpecie = true;
                    }
                    if (!correctSpecie) {
                        correctString = false;
                    }
                }
            } while (!correctString);

            if (data.command.toLowerCase().equals("check-in")) {
                zoo.checkInAnimal(animal);
            }
            if (data.command.toLowerCase().equals("check-out")) {
                zoo.checkOutAnimal(animal);
            }
            if (data.command.toLowerCase().equals("log")) {
                List<InhibitionLog> logs = zoo.getHistory();

                for (InhibitionLog log : logs) {
                    System.out.println(log.toString());
                }
            }
        }
    }
    private boolean isCorrectCommand(String command) {
        boolean result = true;

        switch (command.toLowerCase()){
            case "check-in" :
                //  Команда добавления из зоопарка
                break;
            case "check-out":
                //  Команда удаления из зоопарка
                break;
            case "log":
                //  История
                break;
            default:
                System.out.println(command.toLowerCase());
                result = false;
                break;
        }
        return result;
    }


    public static void main(String[] args) {
        ApplicationZoo applicationZoo = new ApplicationZoo();

            applicationZoo.start();



    }
}
