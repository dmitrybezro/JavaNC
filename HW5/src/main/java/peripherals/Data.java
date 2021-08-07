package peripherals;

public class Data {
    private String command;
    private String specieAnimal;
    private String nameAnimal;
    private int size;

    public Data(DataBuild dataBuild) {
        this.command = dataBuild.command;
        this.specieAnimal = dataBuild.specieAnimal;
        this.nameAnimal = dataBuild.nameAnimal;
        this.size = dataBuild.size;
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

    public int getSize(){
        return size;
    }

    public static class DataBuild{
        private String command;
        private String specieAnimal;
        private String nameAnimal;
        private int size;

        public DataBuild command(String stringCommand){
            this.command = stringCommand;
            return this;
        }

        public DataBuild specie(String stringSpecie){
            this.specieAnimal = stringSpecie;
            return this;
        }

        public DataBuild name(String stringName){
            this.nameAnimal = stringName;
            return this;
        }

        public DataBuild size(int size){
            this.size = size;
            return this;
        }

        public Data build(){
            return new Data(this);
        }
    }
}
