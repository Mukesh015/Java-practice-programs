
import java.util.Scanner;

public class practice5 {
    public static void main(String[] args) {
        int[] ar = new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        for (int i = 0; i < ar.length; i++) {
            ar[i]=sc.nextInt();
        }
        System.out.println("array elements are :");
        for (int i : ar) {
            System.out.println(i);
        }
        sc.close();
    }
}
