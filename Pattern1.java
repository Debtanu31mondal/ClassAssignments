package BasicProgram;
public class Pattern1 {
    public static void main(String[] args) {
        int i, j; // variable declaration 
        for (i = 1; i <= 5; i++) { // Outer loop for row
            for (j = 1; j <= i; j++) { // Inner loop for column and space printing
                System.out.print (" "); 
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
