import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegister {
    private HashMap<RegistrationPlate,String> owners = new HashMap<>();
    public boolean add(RegistrationPlate plate, String owner) {
        if (owners.containsKey(plate)) {
            return false;
        } else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate){
        if (owners.containsKey(plate)){
            return owners.get(plate);
        }else{
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate){
        if(owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }else{
            return false;
        }
    }

    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            String key = plate.toString();
            System.out.println(key);
        }
    }
    public void printOwners(){
        ArrayList<String> names = new ArrayList<>();
        for(RegistrationPlate plate:owners.keySet()){
            String value = owners.get(plate);
            if(!names.contains(value)){
                names.add(value);
            }
        }
        for(String name:names){
            System.out.println(name);
        }
    }
}
