package movable;

import java.util.ArrayList;

public class Group implements Movable {

    private ArrayList<Movable> items;

    public Group() {
        this.items = new ArrayList<Movable>();
    }

    @Override
    public String toString() {
        String out = "";
        for(Movable m : items){
            out += m.toString() + "\n";
        }
        return out;
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m : items){
            m.move(dx,dy);
        }
    }

    public void addToGroup(Movable movable){
        items.add(movable);
    }
}
