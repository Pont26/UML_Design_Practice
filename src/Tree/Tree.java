package Tree;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Tree {
    private double height;
    private int age;
    private Location location;
    private List<Branch> branches;
    public Tree(double height, int age, Location location) {
        this.branches = new ArrayList<Branch>();
        this.height = height;
        this.age = age;
        this.location = location;
        location.addTree(this);
    }
    public void addBranch(Branch branch) {
        branches.add(branch);
    }
    public void display() {
        System.out.println("Tree Height: "+height);
        System.out.println("Tree Age: "+age);
        for (Branch branch : branches) {
            branch.display();
        }
    }
}
