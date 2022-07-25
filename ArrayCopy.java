package array;

public class ArrayCopy {
    public static void main(String[] args) {
       int arr1[]={45,5,85,25,3};
        int arr2[] = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of first array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
            System.out.println("Elements of Second array:");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + " ");
            }

    }
}