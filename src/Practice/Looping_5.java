package Practice;

public class Looping_5 {
    public static void main(String[] args) {
        System.out.print("  ");
        for(int i=1; i<=4; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=1; i<=4; i++){
            System.out.print(i+" ");
            for(int j=1; j<=4; j++){

                System.out.print(j+" ");
           }
            System.out.println();
        }
    }
}
