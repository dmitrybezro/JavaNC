package peripherals;

import java.util.ArrayList;

public class Logging {
    private ArrayList<InhibitionLog> journal = new ArrayList<>();

    public void add(InhibitionLog inhibitionLog){
        journal.add(inhibitionLog);
    }
    public void accept(){
        System.out.println("Accept");
    }

    public void evicted(){
        System.out.println("Evicted");
    }
    public ArrayList<InhibitionLog> getJournal(){
        return this.journal;
    }
}
