import java.util.*;

public class Phonebook {

    private HashMap<String, List<Set<String>>> entries;

    public Phonebook() {
        entries = new HashMap<String, List<Set<String>>>();
    }

    public void addNumber (String name, String data){
        if(!entries.containsKey(name)){
            createPerson(name);
        }
        entries.get(name).get(0).add(data);
    }

    public List<String> getNumbers(String id){
        List<String> numbers = new ArrayList<String>();
        if(entries.containsKey(id)){
            for (String s : entries.get(id).get(0)){
                numbers.add(s);
            }
        } else {
            return null;
        }

        return numbers;
    }

    public String getName(String value) {
        for (Map.Entry<String,List<Set<String>>> entry : entries.entrySet()) {
            for(String s : entry.getValue().get(0)){
                if (value.equals(s)) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public void addAddress(String person, String street, String city){
        if(!entries.containsKey(person)){
            createPerson(person);
        }
        entries.get(person).get(1).add(street);
        entries.get(person).get(2).add(city);

    }

    public List<String> getAddress(String name) {
        List<String> details = new ArrayList<String>();

        if(entries.containsKey(name)){
            for(int i = 1; i < 3; i++){
                if(entries.get(name).get(i)!=null){
                    for(String s : entries.get(name).get(i)){
                        details.add(s);
                    }
                }
            }
            return details;
        }
        return null;
    }

    private void createPerson(String name){
        entries.put(name,new ArrayList<Set<String>>());
        entries.get(name).add(new HashSet<String>());
        entries.get(name).add(new HashSet<String>());
        entries.get(name).add(new HashSet<String>());
    }

    public void remove(String name){
        if(entries.containsKey(name)){
            entries.remove(name);
        }
    }

    public List<String> filteredSearch(String criteria){
        Set<String> names = new HashSet<String>();
        List<String> sortedNames = new ArrayList<String>();


        for (Map.Entry<String,List<Set<String>>> entry : entries.entrySet()){

            Set<String> streets = entry.getValue().get(1);
            Set<String> cities = entry.getValue().get(2);
            Set<String> numbers = entry.getValue().get(0);

            for(String s : numbers) {
                if (s.contains(criteria)) {
                    names.add(entry.getKey());
                }
            }

            for(String s: streets){
                if(s.contains(criteria)){
                    names.add(entry.getKey());
                }
            }

            for(String s : cities){
                if(s.contains(criteria)){
                    names.add(entry.getKey());
                }
            }

            if(entry.getKey().contains(criteria)){
                names.add(entry.getKey());
            }


        }
        for (String s : names){
            sortedNames.add(s);
        }
        Collections.sort(sortedNames);
        return sortedNames;
    }


}
