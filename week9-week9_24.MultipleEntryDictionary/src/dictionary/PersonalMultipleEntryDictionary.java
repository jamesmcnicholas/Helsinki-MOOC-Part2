package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private Map<String, Set> dictionary;

    public PersonalMultipleEntryDictionary() {
        this.dictionary = new HashMap<String,Set>();
    }

    @Override
    public void add(String word, String entry) {
        if(this.dictionary.containsKey(word)){
            this.dictionary.get(word).add(entry);
        } else {
            this.dictionary.put(word,new HashSet<String>());
            this.dictionary.get(word).add(entry);
        }
    }

    @Override
    public Set<String> translate(String word) {
        if(this.dictionary.containsKey(word)){
            return dictionary.get(word);
        }else{
            return null;
        }
    }

    @Override
    public void remove(String word) {
        if (dictionary.containsKey(word)){
            dictionary.remove(word);
        }
    }
}
