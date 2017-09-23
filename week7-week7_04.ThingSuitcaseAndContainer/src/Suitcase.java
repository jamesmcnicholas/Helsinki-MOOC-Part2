
import java.util.ArrayList;

/**
 * Created by James on 19/09/2017.
 */
public class Suitcase {
    private int weightLimit;
    private int capacity;
    private ArrayList<Thing> thingList = new ArrayList<>();

    public Suitcase(int weightLimit){
        this.weightLimit=weightLimit;
    }

    public void addThing(Thing thing){
        if(this.capacity+thing.getWeight()<=this.weightLimit){
                this.thingList.add(thing);
                this.capacity+=thing.getWeight();
        }
    }

    public String toString(){
        if (this.thingList.size()==0) {
            return "empty (0 kg)";
        }else if(this.thingList.size()==1){
            return "1 thing (" + this.capacity + " kg)";
        }else{
            return this.thingList.size() + " things (" + this.capacity + " kg)";
        }
    }

    public void printThings(){
        for(Thing thing:this.thingList){
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        return this.capacity;
    }

    public Thing heaviestThing(){
        if (this.thingList.size()>0) {
            Thing heaviest = this.thingList.get(0);
            for (Thing thing : this.thingList) {
                if (thing.getWeight() > heaviest.getWeight()) {
                    heaviest = thing;
                }
            }
            return heaviest;
        }else{
            return null;
        }
    }
}
