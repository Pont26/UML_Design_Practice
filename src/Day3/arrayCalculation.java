package Day3;

public class arrayCalculation {

    public static int sub(int a,int b){
        System.out.println(a-b);
        return a-b;
    }
    public static int mul(int a,int b){
        System.out.println(a*b);
        return a*b;
    }
    public static int div(int a,int b){
        System.out.println(a/b);
        return a/b;
    }


    public static void main(String[] args) {
        int[] a={15,18,23,27,30,32,35};
        int[] b={19,22,28,40,100,98,85};
        int sum=0;
        int sub=0;
        int mul=0;
        int div=0;
       arrayCalculation calc=new arrayCalculation();


        for(int i=0;i<a.length;i++){
            sum = calc.add(a[i],b[i]);
        }
        System.out.println(" ");
        for(int i=0;i<a.length;i++){
            sub = calc.sub(a[i],b[i]);
        }
        System.out.println(" ");

        for(int i=0;i<a.length;i++){
           mul = calc.mul(a[i],b[i]);
        }
        System.out.println(" ");
        for(int i=0;i<a.length;i++){
            div = calc.div(a[i],b[i]);
        }
    }
}
