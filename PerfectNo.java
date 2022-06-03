// Program to check perfect number
package BasicProgram;
import java.util.Scanner;
public class PerfectNo {
    public void findPerfectNo(int num) { // method creation
        int i, count = 0; // variables declaration in method
        for (i = 1; i < num; i++) {
            if (num % i == 0)
                count = count + i;
        }
        if (num == count) { // checkig with control statement
            System.out.println("This is a perfect number: ");
        } else
            System.out.println("This is not a perfect number: ");
    } // end of method
    public static void main(String[] args) {
        int number; // variable declare in main method
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        number = sc.nextInt(); // taking input from user
        PerfectNo check = new PerfectNo(); // class instantaniate
        check.findPerfectNo(number); // method invoking
    } // end of main method
}