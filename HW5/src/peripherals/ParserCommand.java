package peripherals;

import model.Species;

public class ParserCommand {
    private Data dataParse;

    public ParserCommand(String string){
        String[] data = string.split("\\s+");
        if(data.length == 1) {
            dataParse = new Data.DataBuild().command(data[0]).size(1).build();
        }
        if(data.length == 3){
            dataParse = new Data.DataBuild().command(data[0])
                    .specie(data[1]).name(data[2]).size(3).build();
        }
    }

    public boolean isCorrectString(){
        boolean correctString = false;

        correctString = isCorrectLength(dataParse.getSize());

        if(correctString) {
            correctString = isCorrectCommand(dataParse.getCommand().toLowerCase());
        }

        if(correctString && dataParse.getSize() > 1){
            correctString = isCorrectSpecie(dataParse.getSpecieAnimal().toUpperCase());
        }

        return correctString;
    }

    private boolean isCorrectLength(int length){
        if(length >= 1 && length <= 3) return true;
        return false;
    }

    private boolean isCorrectCommand(String command){
        switch (command){
            case "check-in":
            case "check-out":
                return dataParse.getSize() == 3;
            case "log":
                return dataParse.getSize() == 1;
            default:
                return false;
        }
    }

    private boolean isCorrectSpecie(String specie){
        boolean correct = true;
        try{
            Species.valueOf(specie);
        } catch (IllegalArgumentException e){
            correct = false;
        }
        return  correct;
    }

    public Data getData(){
        return dataParse;
    }
}
