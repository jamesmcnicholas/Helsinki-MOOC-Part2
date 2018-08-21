package tools;

import java.util.*;

public class PersonalDuplicateRemover implements DuplicateRemover{

    private Set words;
    private int duplicates;

    public PersonalDuplicateRemover() {
        this.words = new HashSet<String>();
        this.duplicates = 0;
    }

    @Override
    public void add(String characterString) {
        if (!this.words.contains(characterString)) {
            words.add(characterString);
        } else {
            duplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return words;
    }

    @Override
    public void empty() {
        this.duplicates = 0;
        words.removeAll(words);
    }
}
