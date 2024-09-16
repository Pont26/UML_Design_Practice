package Practice;

public class OnlineStoreSystem {
    public static void main(String[] args) {
        Category c = new Category( "It's about literature.");

        // Create a product instance, using the correct class name and passing the category object separately
        Proudct p = new Proudct("A Little Life", 10000, c);
        p.display();

    }
}
