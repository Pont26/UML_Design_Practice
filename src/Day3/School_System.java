package Day3;


public class School_System {
    public static void main(String[] args) {

        TeacherInfo teacher2=new TeacherInfo("Nyein Khin", 18, "09-4788455");
        TeacherInfo teacher3=new TeacherInfo("Nyein Khin", 18, "09-4788455");


        StudentInfo student1=new StudentInfo("Nyein Khin", 18, "09-4788455");
        StudentInfo student2=new StudentInfo("Pone", 45, "09-4788455");
        StudentInfo student3=new StudentInfo("zaw", 20, "09-4788455");
        StudentInfo student4=new StudentInfo("Thun", 14, "09-4788455");
        StudentInfo student5=new StudentInfo("Nyi", 8, "09-4788455");

        EmployeeInfo employee1=new EmployeeInfo("Thun", 14, "09-4788455");
        EmployeeInfo employee2=new EmployeeInfo("Thun", 14, "09-4788455");

        System.out.println("Teacher total count "+ TeacherInfo.getTeacherCount());
        System.out.println("Student total count "+ StudentInfo.getStudentCount());
        System.out.println("Employee total count "+ EmployeeInfo.getEmployeecount());




    }
}
