// Program to find factorial
package BasicProgram;
import java.util.Scanner;
public class FactorialMethod {
    public int fact(int num){ // method creation
        int f=1,i; // variables declaration in method
        for(i=1;i<=num;i++)
        {
            f=f*i; // storing factorial value
        }
        return f;

    } // end of method
    public static void main(String[] args) {
        int number,factorial; // variable declare in main method
        System.out.println("enter the number: ");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt(); // taking input from user
        FactorialMethod obj=new FactorialMethod(); // class instantaniate
        factorial=obj.fact(number); // method invoking
        System.out.print("the factorial is: "+factorial);
    } // end of main method

}
