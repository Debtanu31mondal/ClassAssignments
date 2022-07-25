package array;
// with static value
import java.util.Scanner;
public class ArrayMultiplication {
    public static void main(String[] args) {
        int i, j, k, sum;
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] mul = new int[3][3];
        // taking inputs is first matrix
        System.out.println("enter the elements of the first matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // taking inputs is second matrix
        System.out.println("enter the elements of the second matrix:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                sum = 0;
                for (k = 0; k < 3; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                mul[i][j] = sum;
            }
        }
        System.out.println("After multiplication");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}
