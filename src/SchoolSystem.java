public class SchoolSystem {
    private String name;
    private int age;
    private String address;
    private String ph;
    public SchoolSystem(String name, int age, String address, String ph) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.ph = ph;

    }

    public void displayStudent(){
        System.out.println(" Name: " + this.name+" Age: "+ this.age+" Address: "+ this.address+" Ph: "+ this.ph);
    }
    public void displayTeacher(){

    }

}
