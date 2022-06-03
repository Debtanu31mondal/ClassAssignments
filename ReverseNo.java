// Program to reverse all digits of an number
package BasicProgram;
import java.util.Scanner;
public class ReverseNo {
    public int revDigit(int num) // method creation
    {
        int rem, reverse=0,temp;// variable declaration of method
        temp=num; //holding the input for future use
        // reverse operation using while loop
        while (num > 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }
        return reverse;
    } // end of method
    public static void main(String[] args) {
        int number,rev; // variable declaration in main method
        System.out.println("Enter the number for reverse: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt(); // taking input from user
        ReverseNo obj= new ReverseNo(); // class instaniate
        rev=obj.revDigit(number); // method invoking
        System.out.println("The reverse number is: "+rev);

    } // end of main method
}
