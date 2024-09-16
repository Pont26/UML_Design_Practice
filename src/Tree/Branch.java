package Tree;

import java.util.ArrayList;
import java.util.List;

public class Branch {
    private double length;
    private List<Leaves> leaves;
    private Tree tree;

    public Branch(double lenght,Tree tree) {
        this.leaves = new ArrayList<Leaves>();
        this.length = lenght;
        this.tree = tree;
        tree.addBranch(this);
    }

    public void addLeaves(Leaves leaf) {
        this.leaves.add(leaf);
    }

    public void display() {
        System.out.println("Branchs lenght: "+ length);
        for (Leaves leaf : leaves) {
            leaf.display();
        }

    }
}
