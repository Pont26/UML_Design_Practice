package Day3;

import Practice.Employee;

public class EmployeeInfo {
    private String name;
    private int age;
    private String address;
    private String ph;
    private static int getEmployeecount=0;
    public EmployeeInfo(String name, int age,String ph) {
        this.name = name;
        this.age = age;
        this.ph = ph;
        getEmployeecount++;

    }

    public void displayEmployeeInfo() {
        System.out.println(" Name: " + this.name+" Age: "+ this.age+" +"+ " Ph: "+ this.ph);
    }
    public static int getEmployeecount() {
        return getEmployeecount;
    }
}
