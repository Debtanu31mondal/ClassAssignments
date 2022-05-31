// print 1 to n natural number in reverse
package BasicProgram;
import java.util.Scanner;
public class ReverseOrder {
    public static void main(String[] args) {
        int i, n;
        System.out.println("enter the end point: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for (i =2 ; i <= 50; i++) {
            if (i%2==0)
            System.out.print(i + " ");
        }
    }
}
