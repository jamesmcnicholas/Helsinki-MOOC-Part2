import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse{
    private Map<String,Integer> store= new HashMap<>();
    private Map<String, Integer> stock = new HashMap<>();

    public void addProduct(String product, int price, int stock){
        if(!store.containsKey(product)){
            store.put(product,price);
        }
        this.stock.put(product,stock);
    }

    public int price(String product){
        if(store.containsKey(product)){
            return store.get(product);
        }
        else{
            return -99;
        }
    }

    public int stock(String product){
        if(stock.containsKey(product)){
            return stock.get(product);
        }else{
            return 0;
        }
    }

    public boolean take(String product){
        if(stock.containsKey(product)) {
            if (stock.get(product) > 0) {
                int temp = stock.get(product);
                stock.remove(product);
                temp--;
                stock.put(product, temp);
                return true;
            }
        }
        return false;
    }

    public Set<String> products(){
        return stock.keySet();
    }
}
