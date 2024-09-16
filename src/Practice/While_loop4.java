package Practice;

public class While_loop4 {
    public static void main(String[] args){
        int i=1;
        int x=1;

        while (i <= 2) {
            int t=x;
             x=t;
            while(x<=t+2){
                System.out.print(x);
                x++;

            }
            //4

        System.out.println(" ");
        i++;
        }


    }
}
