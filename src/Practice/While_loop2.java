package Practice;

public class While_loop2 {
    public static void main(String[] args) {
        int i=1;
        while(i<=3){
            int x=1;
            int y=3;
            while(y>i){
                System.out.print(" ");
                y--;

            }
            while(x<=i){
                System.out.print("*");
                x++;

            }

            System.out.println(" ");
            i++;

            }
        }
    }

