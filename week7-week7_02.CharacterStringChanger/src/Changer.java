import java.util.ArrayList;

/**
 * Created by James on 14/09/2017.
 */
public class Changer {
    private ArrayList<Change> changeList = new ArrayList();

    public Changer(){}

    public void addChange(Change change){
        this.changeList.add(change);
    }

    public String change(String characterString){
        for(Change changers:this.changeList){
            characterString=changers.change(characterString);
        }
        return characterString;
    }
}
