package moving.domain;


import java.util.ArrayList;

public class Box implements Thing{

    private int maximumCapacity;

    private ArrayList<Thing> items = new ArrayList<Thing>();

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public boolean addThing(Thing thing){

        if(getVolume() + thing.getVolume() <= maximumCapacity){
            items.add(thing);
            return true;
        }

        return false;
    }

    @Override
    public int getVolume() {
        int vol = 0;

        for(Thing i : items){
            vol += i.getVolume();
        }

        return vol;
    }
}
