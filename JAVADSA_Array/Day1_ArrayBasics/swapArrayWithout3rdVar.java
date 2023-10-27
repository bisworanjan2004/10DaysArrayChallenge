import java.lang.reflect.Array;

public class swapArrayWithout3rdVar {
    static void swpArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrap(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swpArray(arr, i, j);
            i++;
            j--;
        }

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseArrap(arr);
        System.out.println("The reverse array without making the 3rd array is : ");
        printArray(arr);
    
    }
}
