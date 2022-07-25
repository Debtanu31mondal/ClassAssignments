package array;
import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        int n, i;
        System.out.print("Enter Number of elements in an array : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements of an Array  : ");
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (i = 0; i <arr.length; i++) {
            if (arr[i] < 0) {
                System.out.println(arr[i]);
            }
        }

    }
}

