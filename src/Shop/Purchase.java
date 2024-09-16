package Shop;

import java.util.ArrayList;
import java.util.List;

public class Purchase {
    private Customer customer;
    private Shoe shoe;
    private int qty;
    public Purchase(Customer customer,Shoe shoe, int qty) {
        this.customer = customer;
        this.shoe = shoe;
        this.qty = qty;
        customer.addPurchase(this);
        shoe.addPurchase(this);
    }

    public void display(){
     shoe.display();



    }



}
