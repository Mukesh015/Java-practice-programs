

import java.util.Scanner;

public class practice4 {
    void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping values are " + x + " and " + y);
    }

    void insertFirst(int ar[], int size) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item which you want to insert");
        int item = sc.nextInt();
        for (int i = size - 1; i >= 0; i--) {
            ar[i + 1] = ar[i];
        }
        ar[0] = item;
        size++;
        System.out.println("New array is :");
        for (int i = 0; i < size; i++) {
            System.out.println(ar[i]);
        }
        sc.close();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[50];
        System.out.println("Enter array size");
        int size = sc.nextInt();
        System.out.println("Enter array items");
        for (int i = 0; i < size; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("array items are");
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + "\t");
        }
        System.out.print("\n");
        practice4 obj = new practice4();
        obj.insertFirst(ar, size);
        sc.close();
    }
}