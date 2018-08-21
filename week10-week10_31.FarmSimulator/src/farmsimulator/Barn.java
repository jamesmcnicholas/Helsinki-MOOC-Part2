package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank bulkTank;
    private MilkingRobot milkingRobot;

    public Barn(BulkTank bulkTank) {
        this.bulkTank = bulkTank;
    }

    public BulkTank getBulkTank(){
        return bulkTank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        milkingRobot.setBulkTank(bulkTank);
    }

    public void takeCareOf(Cow cow){
        if(milkingRobot != null){
            milkingRobot.milk(cow);
        } else{
            throw new IllegalStateException();
        }
    }

    public void takeCareOf(Collection<Cow> cows){
        for(Cow c : cows){
            takeCareOf(c);
        }
    }

    @Override
    public String toString() {
        return bulkTank.toString();
    }
}
