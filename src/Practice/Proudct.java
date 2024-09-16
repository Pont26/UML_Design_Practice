package Practice;

public class Proudct {
    public String name;
    public int price;
    public Category category;
    public Proudct(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public void display(){
        System.out.print("Name: " + name + " Price: " + price + " Category: "  );
        category.display();


    }
}
