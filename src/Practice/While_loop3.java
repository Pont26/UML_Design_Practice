package Practice;

public class While_loop3 {
    public static void main(String[] args) {
        int i=1;

        while(i<=3){
            int x=3;
            int y=1;
            while(y<=i){
                System.out.print(" ");
                y++;
            }
            while(x>=i){
                System.out.print("*");
                x--;
            }




            System.out.println(" ");
            i++;
        }
    }
}
