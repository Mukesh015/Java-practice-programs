import java.util.Scanner;

class Prime {
    void isPrime() {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        int i = 1;
        while (i < 10) {
            i++;
            if (num == 1){
                flag = 1;
            }
            else if( i == num){
                continue;
            }
            else{
                if(num % i == 0){
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println(num+" is prime number");
        }
        else{
            System.out.println(num+" is not prime number");
        }
    }
}

public class Practice16 {
    public static void main(String[] args) {
        Prime obj = new Prime();
            obj.isPrime();
    }
}
