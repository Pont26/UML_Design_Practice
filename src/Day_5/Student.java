package Day_5;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student extends Member{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Student[] students = new Student[100];
    private String major;
    private static int getStudentCount;

    public Student(Member member,String major) {
        super(member);
        this.major = major;
        getStudentCount++;
    }

   public static  int getStudentCount() {
        return getStudentCount;
    }

    public  static void getStudentInfo() throws IOException {
        System.out.println("Add Student");
        Member member=getMemberInfo(); //object
        System.out.println("Enter Student major: ");
        String major = br.readLine();
        students[Student.getStudentCount()] = new Student( member, major);

    }
    public static void displayStudentInfo()  {
        System.out.println("Added Students: ");
        for (int i = 0; i < Student.getStudentCount(); i++) {
           System.out.println(students[i]);
        }

    }
    @Override
    public String toString() {
        return  (super.toString() + "Student Major: " + major );

    }

}
