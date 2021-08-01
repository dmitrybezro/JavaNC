package peripherals;

public class Data {
    private String command;
    private String specieAnimal;
    private String nameAnimal;
    public int size;

    Data(String command, String specieAnimal, String nameAnimal) {
        this.command = command;
        this.specieAnimal = specieAnimal;
        this.nameAnimal = nameAnimal;
        size = 3;
    }
    Data(String command) {
        this.command = command;
        size = 1;
    }

    public String getSpecieAnimal() {
        return specieAnimal;
    }

    public String getCommand() {
        return command;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }
}
