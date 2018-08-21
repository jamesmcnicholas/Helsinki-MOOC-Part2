import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {


    private Map<Bird, List<String>> observations = new HashMap<Bird, List<String>>();

    public RingingCentre(){}


    public void observe(Bird bird, String place){
        if(observations.containsKey(bird)){
            observations.get(bird).add(place);
        } else {
            observations.put(bird, new ArrayList<String>());
            observations.get(bird).add(place);

        }
    }

    public void observations(Bird bird){

        if(observations.containsKey(bird)){
            System.out.println(bird + " observations: " + observations.get(bird).size());
            for(String s: observations.get(bird)){
                System.out.println(s);
            }
        } else {
            System.out.println(bird + " observations: 0");
        }

    }
}
