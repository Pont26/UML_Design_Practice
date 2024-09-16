package Shop;

import java.util.ArrayList;
import java.util.List;

public class Shoe {
    private String shoeBrand;
    private int size;
    private String color;
    private int shoePrice;
    private List<Purchase> purchases;
    private ShoeShop shop;
    public Shoe(int size, String color, int shoePrice, String shoeBrand,ShoeShop shop) {
        this.purchases = new ArrayList<Purchase>();
        this.shoePrice = shoePrice;
        this.shoeBrand = shoeBrand;
        this.size = size;
        this.color = color;
        this.shop = shop;
        shop.addShoe(this);
    }
    public void addPurchase(Purchase purchase) {
        purchases.add(purchase);
    }
    public void display() {
        System.out.println("Shoe - Size: " + size + ", Color: " + color + ", Price: " + shoePrice + ", Brand: " + shoeBrand);
    }
}
