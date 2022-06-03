// Print 1 to n even number 
package BasicProgram;
import java.util.Scanner;
public class EvenNumberRange {
    public static void main(String[] args) {
        int i, n; // variable declaration in main method
        System.out.println("enter the end point: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); // taking input from user
        for (i =1 ; i <= n; i++) {
            if (i%2==0) // checking with control statement whether it is an even number
            System.out.print(i + " ");
        }
    }
}
