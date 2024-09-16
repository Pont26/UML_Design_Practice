package Shop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phoneNumber;
    private List<Purchase> purchases;
    public Customer(String name, String ph) {
        this.purchases = new ArrayList<Purchase>();
        this.name = name;
        this.phoneNumber = ph;

    }
    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }
    public String toString(){
        return "Name: " + name + ", Ph: " + phoneNumber;
    }
    public void display() {
        System.out.println("Customer: Name: " + name + ", Ph: " + phoneNumber);
        for (Purchase purchase : purchases) {
            purchase.display();
        }
    }

}
