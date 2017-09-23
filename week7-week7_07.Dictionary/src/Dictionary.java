import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> wordMap = new HashMap<>();

    public String translate(String word){
        if(this.wordMap.containsKey(word)){
            return this.wordMap.get(word);
        }
        return null;
    }

    public void add(String word, String translation){
        this.wordMap.put(word,translation);
    }

    public int amountOfWords(){
        return this.wordMap.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> transList = new ArrayList<>();
        for(String key:wordMap.keySet()){
            transList.add(key+" = "+wordMap.get(key));
        }
        return transList;

    }
}
