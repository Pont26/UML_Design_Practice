package Practice;

public class Circle_Main {
    public static void main(String[] args) {
        Circle c1=new Circle(6);
        c1.setRadious(5);

        System.out.println("Area: "+ c1.Area());
        System.out.println("Circumference: "+c1.circumference());

    }
}
