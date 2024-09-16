package Exercises;

public class Exercise_3 {
    public static void main(String[] args) {
        int i = 1;
        //int k=1;

        while(i<=5){
            int k = 1;
            while(k<=i){
                System.out.print("*");
                k++;
            }
            System.out.println(" ");
            i++;
        }

    }
}
