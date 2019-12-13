public class Fibonacci {
    public static void main(String[] args){
        int zahl = 0, zahl2 = 1, zahl3 = 3, zahl4 = 7;
        //System.out.println(fib(0));
        //System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(7));
        //System.out.println(fib(15));
        //System.out.println(fibIt(15));
        //fibIt(10);
        //fibIt(20);

    }
    public static int fib(int x){
        if(x <= 1){
            return 1;
        }
        else{
            return(fib(x-2)+fib(x-1));
        }
    }
    public static int fibIt(int x){
        int f0 = 0;
        int f1 = 1;
        int f = 1;
        System.out.print(f0+" "+f1+" ");
        for(int i = 2;i<x; i++){
            System.out.print(f+ " ");
            f0 = f1;
            f1 = f;
            f = f0+f1;
        }
        return f;
    }
}
