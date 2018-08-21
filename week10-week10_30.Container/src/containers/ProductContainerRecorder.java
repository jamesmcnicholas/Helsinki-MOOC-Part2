package containers;

public class ProductContainerRecorder extends  ProductContainer {

    private ContainerHistory containerHistory;

    public ProductContainerRecorder(String name, double capacity, double initialVolume) {
        super(name, capacity);
        containerHistory = new ContainerHistory();
        addToTheContainer(initialVolume);

    }

    public String history(){
        return containerHistory.toString();
    }

    public void addToTheContainer(double amount){
        containerHistory.add(amount+this.getVolume());
        super.addToTheContainer(amount);
    }

    public double takeFromTheContainer(double amount){
        containerHistory.add(this.getVolume()-amount);
        return super.takeFromTheContainer(amount);
    }

    public void printAnalysis(){

        System.out.println("Product: " + this.getName());
        System.out.println("History: " + history());
        System.out.println("Greatest product amount: " + containerHistory.maxValue());
        System.out.println("Smallest product amount: " + containerHistory.minValue());
        System.out.println("Average: " + containerHistory.average());
        System.out.println("Greatest change: " + containerHistory.greatestFluctuation());
        System.out.println("Variance: " + containerHistory.variance());

    }
}
