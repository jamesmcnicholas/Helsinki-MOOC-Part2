import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String,Purchase> purchases = new HashMap<>();

    public void add(String product, int price){
        if(!purchases.containsKey(product)){
            purchases.put(product, new Purchase(product,1,price));
        }else{
            purchases.get(product).increaseAmount();
        }
    }

    public int price(){
        int total=0;
        for(Purchase item:purchases.values()){
            total+=item.price();
        }
        return total;
    }

    public void print(){
        for(Purchase item:purchases.values()){
            System.out.println(item);
        }
    }
}
