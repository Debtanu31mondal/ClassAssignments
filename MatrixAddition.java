package array;

import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int i, j, col, row, arr1[][],arr2[][],arrSum[][];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of rows of the matrices: ");
        row = sc.nextInt();
        System.out.println("Enter numbers of coloumns of the matrices: ");
        col = sc.nextInt();
        arr2 = new int[row][col];
        arr1 = new int[row][col];
        arrSum = new int[row][col];
        System.out.println("enter " + row + "x" + col + " elemnets of the first matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter " + row + "x" + col + " elemnets of the second matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                arrSum[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("First Matrix ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Sum of the matrices:");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                System.out.print(arrSum[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
