package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;


import java.util.ArrayList;
import java.util.List;

public class Packer {

    private int boxesVolume;
    private ArrayList<Box> boxList = new ArrayList<Box>();


    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things){

        for (Thing t : things){
            Box b = new Box(boxesVolume);
            b.addThing(t);
            boxList.add(b);
        }
        return boxList;
        /*
        int vol = 0;

        for(Thing t:things){
            vol += t.getVolume();
        }

        double boxes = (vol/boxesVolume);

        if((boxes % 2) != 0){
            boxes++;
        }

        List<Box> boxList = new ArrayList<Box>();

        for(int x = 0; x < boxes; x++){
            boxList.add(new Box(boxesVolume));
        }

        int j = 0;
        for(int i = 0; i < things.size(); i++) {
            Thing t = things.get(i);

            if((boxList.get(j).getVolume() + t.getVolume()) <= boxesVolume){
                boxList.get(j).addThing(t);

            } else {
                j++;
                boxList.get(j).addThing(t);
            }
        }

        return boxList;
        */
    }
}
