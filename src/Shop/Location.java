package Shop;

public class Location {
    private String street;
    private String city;
    private  ShoeShop shop;

    public Location(String street, String city) {
        this.street = street;
        this.city = city;


    }
    public ShoeShop getShop() {
        return shop;
    }

    public void addShop(ShoeShop shop){
        this.shop = shop;

    }
    public void display(){
        System.out.println("Street: "+street + "City: " + city);
    }


}
