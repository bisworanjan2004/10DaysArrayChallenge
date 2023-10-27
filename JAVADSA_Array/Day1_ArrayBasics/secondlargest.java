// Find the second largest element in the array.

import java.util.Scanner;

public class secondlargest {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }
        System.out.println();
    }

    static int MaxValue(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
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
        System.out.println("The Entered numbers are : ");
        printArray(arr);

        int maximum = MaxValue(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maximum) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int maxvalue2 = MaxValue(arr);
        System.out.println("The 2nd highest value is : " + maxvalue2);
    }
}
