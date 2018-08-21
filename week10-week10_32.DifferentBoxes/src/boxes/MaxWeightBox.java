package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private ArrayList<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int weight = 0;
        for(Thing t : things){
            weight += t.getWeight();
        }
        if(!(weight + thing.getWeight() > maxWeight)){
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        boolean found = false;

        for(Thing t : things){
            if (t.equals(thing)){
                found = true;
            }
        }
        return found;
    }


}
