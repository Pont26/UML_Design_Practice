package Day_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentSystemAPP {

   private static int chooseNumber = 0;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void WelcomeDisplay() throws IOException {
        System.out.println("Welcome to Student System");
        System.out.println("Welcome Member!!");
        System.out.println("1. Choose member type to add");
        System.out.println("2. display all member");
        System.out.println("3. display  counts");
        System.out.println("4.Exist");
        chooseNumber = Integer.parseInt(br.readLine());
    }
    public static void  memberRegister() throws IOException {
        String memberType = "";
        String answer = "";
        do {
            WelcomeDisplay();
            if (chooseNumber == 1) {
                System.out.println("Enter member type: student or teacher or employee ");
                memberType = br.readLine();
                do {
                    if (memberType.equals("student")) {
                        Student.getStudentInfo();
                        System.out.println("Do you want to add more. yes or no");
                        answer = br.readLine();
                    }
                } while (answer.equals("yes"));
                do {
                    if (memberType.equals("teacher")) {
                        Teacher.getTeacherInfo();
                        System.out.println("Do you want to add more. yes or no");
                        answer = br.readLine();
                    }
                } while (answer.equals("yes"));
                do {
                    if (memberType.equals("employee")) {
                        Employee.getEmployeeInfo();
                        System.out.println("Do you want to add more. yes or no");
                        answer = br.readLine();
                    }
                } while (answer.equals("yes"));
            } else if (chooseNumber == 2) {
                StudentSystemAPP.displayMembers();
            } else if (chooseNumber == 3) {
                StudentSystemAPP.displayEachMemberCount();
            } else {
                System.out.println("End");
            }

        }while(chooseNumber!=4);
    }

    public static void displayMembers() {
        Student.displayStudentInfo();
        Teacher.TeacherInfo();
        Employee.dispayEmployeeInfo();
    }
    public static void displayEachMemberCount() {
        System.out.print("Student count: ");
        System.out.println(Student.getStudentCount());
        System.out.print("Teacher count: ");
        System.out.println(Teacher.getTeachercount());
        System.out.print("Employee count: ");
        System.out.println(Employee.getEmployeeCount());
    }
     public static void main(String[] args) throws IOException {
            memberRegister();
    }

}
