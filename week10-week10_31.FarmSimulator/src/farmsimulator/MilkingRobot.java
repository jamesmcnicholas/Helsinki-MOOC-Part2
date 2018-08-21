package farmsimulator;

public class MilkingRobot {

    private BulkTank bulkTank;


    public MilkingRobot() {
    }

    public BulkTank getBulkTank(){
        return bulkTank;
    }

    public void setBulkTank(BulkTank bulkTank){
        this.bulkTank = bulkTank;
    }

    public void milk(Milkable milkable){
        if(bulkTank != null){
            bulkTank.addToTank(milkable.milk());
        } else {
            throw new IllegalStateException();
        }
    }
}
