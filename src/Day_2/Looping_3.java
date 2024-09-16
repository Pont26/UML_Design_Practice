package Day_2;

public class Looping_3 {
    public static void main(String[] args) {
          int j=1;
        //int t=j; //error
        for(int i=1; i<=4;i++){
            int t=j;

            for( j = t; j<=t+4; j++) {
                System.out.print(" "+j);
           }

            System.out.println(" ");

            }

        }
    }

