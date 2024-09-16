package Day_5;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calcution {
    public static int add(int numA, int numB) {
        return numA + numB;
    }
    public static int sub(int numA, int numB) {
        return numA-numB;
    }
    public static int mul(int numA, int numB) {
        return numA * numB;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chooseNumber;
        int numA=0;
        int numB=0;

        do {
            System.out.println("Welcome!! choose numbers");
            System.out.println("1.add");
            System.out.println("2.subtract");
            System.out.println("3.multiply");
            System.out.println("4.Exit");
            chooseNumber = Integer.parseInt(br.readLine());
             if (chooseNumber !=4 ) {
                 System.out.print("Enter first Number: ");
                 numA = Integer.parseInt(br.readLine());
                 System.out.print("Enter second Number: ");
                 numB = Integer.parseInt(br.readLine());
             }
                 if (chooseNumber == 1) {
                     int sum = add(numA, numB);
                     System.out.println("Answer: " + sum);
                     System.out.println("--------------------");
                 } else if (chooseNumber == 2) {
                     int sub = sub(numA, numB);
                     System.out.println("Answer: " + sub);
                     System.out.println("--------------------");
                 } else if (chooseNumber == 3) {
                     int mul = mul(numA, numB);
                     System.out.println("Answer: " + mul);
                     System.out.println("--------------------");
                 } else {
                     System.out.println("End");
                 }

        } while(chooseNumber !=4);



    }
}

