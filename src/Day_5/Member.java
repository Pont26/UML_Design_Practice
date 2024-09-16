package Day_5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Member {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private String name;
    private String email;
    private String address;
    static int count=0;

    public Member(Member member) {
        this.name = member.getName();
        this.email = member.getEmail();
        this.address = member.getAddress();

    }
    public Member(String name,String email,String address) {
        this.name = name;
        this.email = email;
        this.address = address;
        count++;
    }


    public String toString(){
        return ("Student Name: " + this.name + " Student Email: " + this.email + " Student Address: " + this.address);
    }

    public static Member getMemberInfo() throws IOException {
        System.out.print("Enter  name: ");
         String name = br.readLine();
        System.out.print("Enter  Email: ");
         String email = br.readLine();
        System.out.print("Enter  address: ");
         String address = br.readLine();
         return new Member(name,email,address);

    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.name;
    }
    public String getAddress() {
        return this.name;
    }






}
