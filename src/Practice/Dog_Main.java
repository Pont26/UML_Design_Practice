package Practice;

public class Dog_Main {
    public static void main(String[] args) {
        Dog dog1=new Dog("Mo Nyo","German shepherd");
        Dog dog2=new Dog("Buddy","Golden Retriever");
        System.out.println("Dog Name: " + dog1.getName() + " Dog breed: "+dog1.getBreed());
        System.out.println("Dog Name: " + dog2.getName() + " Dog breed: "+dog2.getBreed());
        dog1.setName("My baby");
        dog2.setBreed("Bulldog");
        System.out.println("Dog Name: "+ dog1.getName());
        System.out.println("Dog Breed: "+ dog1.getBreed());
    }
}
