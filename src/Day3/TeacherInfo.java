package Day3;

public class TeacherInfo {

    private int age;
    private String address;
    private String ph;
    private static int getTeacherCount=0;
    public TeacherInfo(String name, int age, String ph) {
        this.name = name;
        this.age = age;
        this.ph = ph;
        getTeacherCount++;

    }



    public void displayTeacher(){
        System.out.println(" Name: " + this.name+" Age: "+ this.age+" +"+ " Ph: "+ this.ph);
    }
    public static int getTeacherCount(){
        return getTeacherCount;
    }
}
