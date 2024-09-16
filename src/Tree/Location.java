package Tree;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private String street;
    private String city;
    private List<Tree> trees;
    public Location(String street, String city) {
        this.trees = new ArrayList<Tree>();
        this.street = street;
        this.city = city;
    }
    public void addTree(Tree tree) {
        trees.add(tree);
    }
    public void display() {
        System.out.println("Location: " + street + ", " + city);
        System.out.println("=========");
        for (Tree tree : trees) {
            tree.display();
        }
    }
}
