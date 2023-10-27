import java.util.Scanner;

public class rotateArray1 {
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }
    }

    static int[] reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }

    static void Rotate1(int[] arr, int k) {
        int n = arr.length;
       
        
        reverse(arr, 0, n - k - 1);

        reverse(arr, n - k, n-1);

         reverse(arr, 0, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The Ans array is : " + arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the K : ");
        int k = sc.nextInt();
        System.out.println("Originala array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        Rotate1(arr, k);
        
    }
}
