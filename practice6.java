

public class practice6 {

    static int factorial(int x) {
        if (x == 0) {
            return 1;
        } 
        else {
            return x * factorial(x - 1);
        }
    }

    static int fibonachi(int x) {
       if (x==0) {
        return 0;
       }
       else{
        return x+(fibonachi(x-1));
       }
    }

    public static void main(String[] args) {
        int a=fibonachi(5);
        int c = factorial(5);
        System.out.println(a);
        System.out.println(c);
    }
}