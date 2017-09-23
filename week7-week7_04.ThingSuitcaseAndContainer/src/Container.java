import java.util.ArrayList;

/**
 * Created by James on 20/09/2017.
 */
public class Container {
    private int weightLimit;
    private int capacity;
    private ArrayList<Suitcase> caseList = new ArrayList<>();

    public Container(int weightLimit){
        this.weightLimit=weightLimit;
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.capacity+suitcase.totalWeight()<=this.weightLimit){
            this.caseList.add(suitcase);
            this.capacity+=suitcase.totalWeight();
        }
    }

    public String toString(){
        return this.caseList.size()+" suitcases ("+this.capacity+" kg)";
    }

    public void printThings(){
        for(Suitcase suitcase:this.caseList){
            suitcase.printThings();
        }
    }
}
