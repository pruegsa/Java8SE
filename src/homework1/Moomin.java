package homework1;

import java.util.Scanner;

/**
 * 590923
 *
 * @author Koi
 */
public class Moomin {

    public static void main(String args[]) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scannerItem = new Scanner(System.in);
        Scanner scannerPrice = new Scanner(System.in);

        Double wallet = 20.0;

        //Case 1
        
        cart.addItem("Shirt", 10.0);
        cart.addItem("Plant", 5.0);
        cart.removeItem("Shirt", 10.0);
        cart.addItem("Car", 10.0);
        cart.checkout();
        
        
        //Case 2
        /*
        //cart.addItem("Shirt", 10.0);
        //cart.addItem("Plant", 5.0);
        for (int i = 0; i < 2; i++) {

            System.out.println("What do you want to buy Moomin?");
            String itemName = scannerItem.nextLine();
            String price = scannerPrice.nextLine();
            if (wallet >= Double.parseDouble(price)) {
                cart.addItem(itemName, Double.parseDouble(price));
                wallet -= Double.parseDouble(price);
            } else {
                System.out.println("Not Enough Money, available money = " + wallet);
                i--;
            }
            //cart.removeItem("Shirt", 10.0);
        }
        System.out.println("What do you want to remove Moomin?");
        String itemName = scannerItem.nextLine();
        String price = scannerPrice.nextLine();
        cart.removeItem(itemName, Double.parseDouble(price));
        wallet += Double.parseDouble(price);

        //cart.addItem("Car", 10.0);
        System.out.println("Anythng else? ");
        itemName = scannerItem.nextLine();
        price = scannerPrice.nextLine();
        if (wallet >= Double.parseDouble(price)) {
            cart.addItem(itemName, Double.parseDouble(price));
            wallet -= Double.parseDouble(price);
        } else {
            System.out.println("Not Enough Money, available money = " + wallet);
        }

        cart.checkout();
*/
    }
}
