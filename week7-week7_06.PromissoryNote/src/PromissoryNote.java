import java.util.HashMap;

/**
 * Created by James on 20/09/2017.
 */
public class PromissoryNote {
    private HashMap<String, Double> noteMap = new HashMap<>();

    public PromissoryNote(){}

    public void setLoan(String toWhom, double value){
        this.noteMap.put(toWhom,value);
    }

    public double howMuchIsTheDebt(String whose){
        if(noteMap.containsKey(whose)){
            return noteMap.get(whose);
        }
        return 0;
    }
}
