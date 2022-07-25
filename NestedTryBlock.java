package exception;

public class NestedTryBlock {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try{
            try {
                String s = null;
                System.out.println(s.length());
            } catch (NullPointerException e) {
                System.out.println("Exception:string object is null");
            }
            try {
                arr[7] = 20;
                System.out.println(arr[7]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception" + e.getMessage());
            }
            System.out.println("rest of codess");
            int a = 10, b = 0, c;
            c = a / b;
            System.out.println(c);

        }catch(Exception e){
            System.out.println("Exception"+e.getMessage());
        }
    }
}
