package moving;


import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import moving.logic.Packer;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // the things we want to pack
        Packer packer = new Packer(1000);
        List<Thing> things = new ArrayList<Thing>();
        things.add( new Item("Olutkori", 10) );
        things.add( new Item("Stone", 5) );
        things.add( new Item("Taulu", 20) );
        packer.packThings( things );
        // we create a packer which uses boxes whose valume is 10

        // we ask our packer to pack things into boxes
        List<Box> boxes = packer.packThings( things );

        System.out.println("number of boxes: "+boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: "+box.getVolume()+" dm^3");
        }

    }
}
