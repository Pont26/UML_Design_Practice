package Day_2;

public class Looping_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
//something
            System.out.println(i +" * 2= "+ (i*2));
            System.out.println(i +" * 2= "+ (i*2));
            System.out.println(i +" * 2= "+ (i*2));
            System.out.println(i +" * 2= "+ (i*2));
        }
    }
    public static void deleteFruit(String[] fruits) {
        fruits[0] = "Grape";
        System.out.println(fruits[0]); // Output: Grape
    }
}
