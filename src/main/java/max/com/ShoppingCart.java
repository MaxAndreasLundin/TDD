package max.com;

import java.util.HashMap;

public class ShoppingCart {
    HashMap<String, Integer> list;

    public ShoppingCart() {
        list = new HashMap<>();
    }

    public void addItem(String product, Integer value) {
        list.put(product, value);
    }

    public int totalValueOfCart(){
        int total = 0;
        for (Integer i : list.values()) {
            total += i;
        }
        return total;
    }
}
