package Practice;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadious(){
        return radius;

    }
    public void setRadious(double radius){
        this.radius = radius;
    }
    public double Area(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        return 2 * Math.PI * radius;
    }
}
