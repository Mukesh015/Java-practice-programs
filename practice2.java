
import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Bengali : ");
        int ben = sc.nextInt();
        System.out.println("Enter marks of Maths : ");
        int math = sc.nextInt();
        System.out.println("Enter marks of Geography : ");
        int geo = sc.nextInt();
        System.out.println("Enter marks of History : ");
        int his = sc.nextInt();
        System.out.println("Enter marks of physical Science : ");
        int psci = sc.nextInt();
        System.out.println("Enter marks of life Science : ");
        int lsci = sc.nextInt();
        System.out.println("Enter marks of chemistry : ");
        int chem = sc.nextInt();
        int marks = (ben + math + geo + his + psci + lsci + chem);
        int percent = (marks / 7);
        System.out.println("Your total marks:" + marks);
        System.out.print("Your percentage is:" + percent);
        sc.close();
    }
}