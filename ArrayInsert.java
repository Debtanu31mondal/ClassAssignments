package array;

import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {
        int n, i, pos, a;
        System.out.print("Enter Number of elements in an array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("Enter " + n + " elements of an Array  : ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the specific position where you want to insert the element");
        pos = sc.nextInt();
        System.out.println("Enter the element you want to insert");
        a = sc.nextInt();
        for (i = (n - 1); i >= (pos-1); i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos - 1] = a;
        System.out.println("New array: ");
        for (i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
