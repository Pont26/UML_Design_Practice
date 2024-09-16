package Day3;

public class method {

    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        method m = new method();
        int a = 13;
        int b = 14;
        int i=1;


        while(i<=3){
            int sum = m.add(a,b);
            System.out.println( a + " + "+ b +" = "+ sum);
            a = a+1;
            b = b+1;
            i++;
        }
        System.out.println(" ");
        System.out.println("hello");


        while(i<=3){
            int sub = m.sub(a,b);
            System.out.println( a + " - "+ b +" = "+ sub);
            a = a+1;
            b = b+1;
            i++;
        }
        System.out.println("hello");
        System.out.println(" ");





        int mul;
        mul = m.mul(13,14);
        System.out.println("13 * 14 = "+mul);
        mul = m.mul(14,15);
        System.out.println("14 * 15 = "+mul);
        mul = m.mul(15,16);
        System.out.println("15 * 16 = "+mul);


    }
}
