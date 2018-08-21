package farmsimulator;

import java.util.ArrayList;

public class Farm implements Alive{

    private String owner;
    private Barn barn;
    private ArrayList<Cow> animals;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        animals = new ArrayList<Cow>();
    }

    @Override
    public String toString() {
        String animalList = "No cows.";

        if(animals.size() > 0) {
            animalList = "Animals:";

            for(Alive a : animals){
                animalList += "\n" + a;
            }

        }
        return "Farm owner: " + owner + "\n"
                + "Barn bulk tank: " + barn.getBulkTank()
                + "\n" + animalList;

    }

    public String getOwner() {
        return owner;
    }

    @Override
    public void liveHour() {
        for(Alive a : animals){
            a.liveHour();
        }
    }

    public void addCow(Cow cow){
        animals.add(cow);
    }

    public void manageCows(){
        for(Cow c : animals){
            barn.takeCareOf(c);
        }
    }

    public void installMilkingRobot(MilkingRobot milkingRobot){
        barn.installMilkingRobot(milkingRobot);
    }
}
