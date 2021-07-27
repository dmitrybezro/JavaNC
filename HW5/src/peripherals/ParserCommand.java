package peripherals;

public class ParserCommand {
    private Data dataParse;
    //  Парсит строку по пробелам
    public Data pars(String string) {
        String[] data = string.split("\\s+");
        if(data.length == 1){
            dataParse = new Data(data[0]);
        } else {
            dataParse = new Data(data[0], data[1], data[2]);
        }
        return dataParse;
    }
}
