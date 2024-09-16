package Practice;

public class While_loop {
    public static void main(String[] args) {
    int i=1;

    while(i<=3){
        int x=3;

        while(x>=i){
            System.out.print("*");
            x--;
        }
        System.out.println(" ");
        i++;
    }
    }
}
