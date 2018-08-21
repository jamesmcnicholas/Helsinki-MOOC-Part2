import java.util.ArrayList;

public class Participant implements Comparable<Participant> {

    private String name;
    private int points;
    private ArrayList<Integer> jumps;

    public Participant(String name) {
        this.name = name;
        this.points=0;
        jumps = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ArrayList<Integer> getJumps(){
        return jumps;
    }
    public void addJump(int jump){
        this.jumps.add(jump);
    }

    public void printJumps(){
        for(int j : jumps){
            if (jumps.indexOf(j) == jumps.size()-1){
                System.out.print(j+" m\n");
            }else{
                System.out.print(j+" m, ");
            }
        }
    }

    @Override
    public String toString(){
        return (name + " ("+points+" points)");
    }

    @Override
    public int compareTo(Participant o) {
        if(this.points>o.getPoints()){
            return -1;
        }else if(this.points<o.getPoints()){
            return 1;
        }
        return 0;
    }
}
