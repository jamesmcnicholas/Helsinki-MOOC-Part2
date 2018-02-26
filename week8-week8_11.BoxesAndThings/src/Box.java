import java.util.ArrayList;

public class Box implements ToBeStored{

    private double maxWeight;
    private double currentWeight;
    private ArrayList<ToBeStored> items = new ArrayList<>();

    public Box(double maxWeight){
        this.maxWeight=maxWeight;
        this.currentWeight=0;
    }

    public void add(ToBeStored item){
        if (item.weight()+currentWeight<maxWeight){
            items.add(item);
            currentWeight+=item.weight();
        }
    }

    public double weight() {
        double weight = 0;
        for (ToBeStored item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString(){
        return "Box: "+items.size()+" things, total weight "+weight()+" kg";
    }
}
