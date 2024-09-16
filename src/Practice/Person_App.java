package Practice;

public class Person_App {
    public static void main(String[] args){
        Person p1=new Person("Ean Craig",11);
        Person p2=new Person("Ean Ross",12);
        System.out.println("Name: "+p1.getName()+" Age: "+p1.getAge());
        p1.setName("Pone");
        p1.setAge(18);
        System.out.println("Name: "+p1.getName()+" Age: "+p1.getAge());
    }
}
