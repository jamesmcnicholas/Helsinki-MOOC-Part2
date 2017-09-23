/**
 * Created by James on 21/09/2017.
 */
public class Plane {
    private String ID;
    private int capacity;

    public Plane(String ID, int capacity){
        this.ID=ID;
        this.capacity=capacity;
    }
    public String toString(){
        return this.ID+" ("+this.capacity+" ppl)";
    }
    public int getCapacity(){
        return capacity;
    }
    public String getID(){
        return ID;
    }
}
