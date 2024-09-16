package Practice;

public class Employee {
    private String name, job_title;
    private int salary;

    public Employee(String name, String job_title, int salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getJob_title() {
        return job_title;
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setJob_title(String job_title){
        this.job_title = job_title;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    //method to raise the salary of the employee by a given percentage
    public void raiseSalary(int percentage){
        salary += salary*percentage/100;
    }
    public void printEmployeeDetail(){
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + job_title);
        System.out.println("Salary: " + salary);
    }
}
