package homework1;
import java.util.ArrayList;
/**
 *
 * @author Koi
 */

public class ShoppingCart {
    //properties
    private ArrayList<String> items = new ArrayList<String>();
    private ArrayList<Double> prices = new ArrayList<Double>();
    
    //Behavior
    public void checkout() {
        Double totalPrice=0.0;
        for (int i = 0; i < prices.size(); i++) {
            totalPrice += prices.get(i);
        }
        
        System.out.println("totalPrice of items is " + totalPrice);
    }

    public void addItem(String itemName, Double price) {
        items.add(itemName);
        prices.add(price);
        //totalPrice += price;
    }

    public void removeItem(String itemName, Double price) {
       int index = items.indexOf(itemName);
       items.remove(index);
       prices.remove(index);
       //totalPrice -= price;
        /*for (String item : items) {
            if (item.equalsIgnoreCase(itemName)) {
                items.remove(itemName);
            }
        }*/

    }
}
