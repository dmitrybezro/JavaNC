package peripherals;

import animals.Giraffe;
import animals.Leon;
import animals.Penguin;
import animals.Squirrel;
import model.Animal;
import model.Species;

public class ParserCommand {
    private Data dataParse;
    public Data pars(String string) {  //  Возвращать параметры
        //  Вводить здесь
        String[] data = string.split("\\s+");
        //System.out.println(data[1]);
        if(data[0] == null)
            data[0] = "";
        if(data[1] == null)
            data[1] = "";
        if(data[2] == null)
            data[2] = "";
        dataParse = new Data(data[0], data[1], data[2]);
        return dataParse;

    }

    public static void main(String[] args) {
        String str = "check-in Leon Leo";
        ParserCommand parserCommand = new ParserCommand();
        parserCommand.pars(str);

    }
}
