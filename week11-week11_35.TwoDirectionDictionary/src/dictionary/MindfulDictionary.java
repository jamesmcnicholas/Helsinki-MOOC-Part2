package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

public class MindfulDictionary {

    private HashMap<String,String> dictionary;
    private HashMap<String,String> reverseDict;
    private File file;

    public MindfulDictionary() {
        dictionary = new HashMap<String,String>();
        reverseDict = new HashMap<String,String>();
    }

    public MindfulDictionary(String file){
        dictionary = new HashMap<String,String>();
        reverseDict = new HashMap<String,String>();
        this.file = new File(file);

    }


    public void add(String word, String translation){
        if(!dictionary.containsKey(word)){
            dictionary.put(word,translation);
            reverseDict.put(translation,word);
        }
    }

    public String translate(String word){
        if(dictionary.containsKey(word)){
            return dictionary.get(word);
        }
        if(reverseDict.containsKey(word)){
            return reverseDict.get(word);
        }

        return null;

    }

    public void remove(String word){
        if(dictionary.containsKey(word)){
            reverseDict.remove(dictionary.get(word),word);
            dictionary.remove(word);
        } else if (reverseDict.containsKey(word)){
            dictionary.remove(reverseDict.get(word),word);
            reverseDict.remove(word);
        }
    }

    public boolean load(){
        try{
            Scanner reader = new Scanner(file);

            while ( reader.hasNextLine() ){
                String line = reader.nextLine();
                String[] parts = line.split(":");

                add(parts[0],parts[1]);     // the part of the line before
            }
            reader.close();
            return true;
        } catch (Exception e){
            return false;
        }
    }

    public boolean save(){
        try{

            FileWriter fw = new FileWriter(file);

            for(String s : dictionary.keySet()){
                fw.write(s + ":" + dictionary.get(s) +"\n");
            }

            fw.close();

            return true;
        } catch (Exception e){
            return false;
        }
    }
}
