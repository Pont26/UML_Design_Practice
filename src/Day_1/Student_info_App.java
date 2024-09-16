package Day_1;

public class Student_info_App {

    public static void main(String[] args) {
        Student_info student1=new Student_info("Nyein Khin", 18, "Taunggyi","09-4788455");
        Student_info student2=new Student_info("Pone", 45, "Taunggyi","09-4788455");
        Student_info student3=new Student_info("zaw", 20, "Yangon","09-4788455");
        Student_info student4=new Student_info("Thun", 14, "Thai","09-4788455");
        Student_info student5=new Student_info("Nyi", 8, "Taunggyi","09-4788455");
        student1.display();
        student2.display();
        student3.display();
        student4.display();
        student5.display();

    }
}
