package Practice;

public class Dog {
    private String name,breed;
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
}
