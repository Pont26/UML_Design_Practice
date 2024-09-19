package Day_1;

public class Student_info {
    there are errors
    private String name;
    private int age;
    private String address;
    private String ph;

    public Student_info(String name, int age, String address, String ph) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.ph = ph;

    }
    public void display(){
        System.out.println(" Name: " + this.name+" Age: "+ this.age+" Address: "+ this.address+" Ph: "+ this.ph);
    }
}
