package Day3;

public class StudentInfo {
    private String name;
    private int age;
    private String address;
    private String ph;
    private static int getStudentCount=0;
    public StudentInfo(String name, int age,  String ph) {
        this.name = name;
        this.age = age;
        this.ph = ph;
        getStudentCount++;

    }

    public void displayStudentInfo() {
        System.out.println(" Name: " + this.name+" Age: "+ this.age+" +"+ " Ph: "+ this.ph);
    }
    public static int getStudentCount() {
        return getStudentCount;
    }
}
