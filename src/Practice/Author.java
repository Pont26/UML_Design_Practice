package Practice;

public class Author {
    public String name;
    public String email;
    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public void display() {
        System.out.println("Author name: "+ name + " Author email " + email);
    }
}
