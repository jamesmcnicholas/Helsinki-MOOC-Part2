package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity(){
        return this.capacity;
    }

    public double getVolume() {
        return volume;
    }

    public double howMuchFreeSpace(){
        return capacity-volume;
    }

    public void addToTank(double amount){
        volume += amount;
        if(volume > capacity){
            volume = capacity;
        }
    }

    public double getFromTank(double amount){

        double howmuch = 0;
        if((volume - amount) > 0){
            volume -= amount;
            howmuch = amount;
        } else {
            howmuch = volume;
            volume = 0;
        }

        return howmuch;
    }

    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity);
    }
}
