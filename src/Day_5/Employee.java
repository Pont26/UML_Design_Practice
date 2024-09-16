package Day_5;

import Practice.Person;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee extends Member {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  private  static Employee[] employees = new Employee[100];

 private String empDepartment;
 private int empSalaryRate;
 private int empWorkingDay;
 private static int getEmployeeCount;
 public Employee(String empName, String empEmail, String empAddress, String empDepartment, int empSalaryRate, int empWorkingDay) {
    super(empName, empEmail, empAddress);
     this.empDepartment = empDepartment;
     this.empSalaryRate = empSalaryRate;
     this.empWorkingDay = empWorkingDay;
     getEmployeeCount++;
 }
 public static  int getEmployeeCount() {
     return getEmployeeCount;
 }


    public static void getEmployeeInfo() throws IOException {
        System.out.println("Add Employee");
        Member member=getMemberInfo();
        System.out.print("Enter Employee department: ");
        String department=br.readLine();
        System.out.print("Enter Employee Salary Rate: ");
        int salaryRate=Integer.parseInt(br.readLine());
        System.out.print("Enter Employee Working Day: ");
        int workingDay=Integer.parseInt(br.readLine());
        employees[Employee.getEmployeeCount()]=new Employee(member.getName(),member.getEmail(),member.getAddress(),department,salaryRate,workingDay);
    }
    public static void dispayEmployeeInfo(){
        System.out.println("Added Employees: ");
        for(int y=0; y< Employee.getEmployeeCount();y++){
            System.out.println(employees[y]);
        }
    }
    @Override
    public String toString() {
     return (super.toString()+ empDepartment + empSalaryRate + empWorkingDay);

    }



}
