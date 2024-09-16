package Tree;

public class Leaves {
    private String color;
    private String shape;
    private Branch branch;
    public Leaves(String color, String shape, Branch branch) {
        this.color = color;
        this.shape = shape;
        this.branch = branch;
        branch.addLeaves(this);

    }
    public void display() {
        System.out.println("Leaf: Color: " + color + ", Shape: " + shape);
    }
}
