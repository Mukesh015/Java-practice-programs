
import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
        System.out.println("Welcome to my program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum of two numbers is");
        System.out.println(sum);
        System.out.println("Enter a string");
        String str = sc.next();
        System.out.println(str);
        sc.close();
    }
}