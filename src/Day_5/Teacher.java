package Day_5;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Teacher extends Member {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static Teacher[] teachers = new Teacher[100];

    private int workingHour;
    private int salaryRate;
    private String department;
    private static int Teachercount;


    public Teacher(String name, String email, String address,int workingHour, int salaryRate, String department) {
        super(name, email, address);
        this.workingHour = workingHour;
        this.salaryRate = salaryRate;
        this.department = department;
        Teachercount++;

    }
   public static int getTeachercount(){
        return Teachercount;

    }

    public static void getTeacherInfo() throws IOException {

        System.out.println("Add Teacher");
       Member member=getMemberInfo();
        System.out.print("Teacher Working hours: ");
        int workingHour = Integer.parseInt(br.readLine());
        System.out.print("Teacher Salary rate: ");
        int salaryRate = Integer.parseInt(br.readLine());
        System.out.print("Teacher Department: ");
        String department = br.readLine();
        teachers[Teacher.getTeachercount()] = new Teacher(member.getName(), member.getEmail(), member.getAddress(), workingHour,salaryRate, department);
    }
 public static void  TeacherInfo(){
     System.out.println("Added Teachers: ");
     for (int x = 0; x < Teacher.getTeachercount(); x++) {
         System.out.println(teachers[x]);
     }
 }
@Override
    public String toString() {
        return (super.toString()+workingHour+salaryRate+department);
}


}

