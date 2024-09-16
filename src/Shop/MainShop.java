package Shop;

public class MainShop {
    public static void main(String[] args) {
        Location location=new Location("Bo Bo","Yangon");
        ShoeShop shop=new ShoeShop("Lily",location);
        shop.display();
        Customer c1=new Customer("Nyein Khin","4568452888");
        Shoe sho=new Shoe(35,"black",300,"cherry",shop);
        Shoe sho2=new Shoe(40,"white",200,"Niki",shop);
        Purchase p1=new Purchase(c1,sho,5);
        Purchase p2=new Purchase(c1,sho2,3);
        Customer c2=new Customer("Pone Pone","4568452888");
        Purchase p3=new Purchase(c2,sho,2);
        c1.display();
        c2.display();




    }
}
