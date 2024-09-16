package Shop;

import java.util.ArrayList;
import java.util.List;

public class ShoeShop {
    private String shopName;
    private  Location location;
    private List<Shoe> shoes;
    public ShoeShop(String shopName, Location location) {
        this.shoes = new ArrayList<Shoe>();
        this.shopName = shopName;
        this.location = location;
        location.addShop(this);
    }
    public void addShoe(Shoe shoe) {
        shoes.add(shoe);
    }
    public void display() {
        System.out.println("Shop Name: "+shopName);
        location.display();

    }
}
