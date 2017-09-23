import java.util.HashMap;

public class Flight {
    private String ID;
    private String departure;
    private String destination;
    private int capacity;
    private Plane plane;
    private HashMap<String, Plane> flightMap = new HashMap<>();

    public Flight(Plane plane,String departure,String destination){
        this.plane = plane;
        this.ID=plane.getID();
        this.departure=departure;
        this.destination=destination;
        this.capacity=plane.getCapacity();
    }
    public String toString(){
        return this.ID+" ("+this.capacity+" ppl) ("+this.departure+"-"+this.destination+")";
    }
}
