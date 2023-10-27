package day6Pattern;

import java.util.Scanner;

public class oneBasedIndexsum {
    // static void printArray(int[] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(" " + arr[i]);
    //     }
    // }

    static int[] prefixSum(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x + 1];
        System.out.println("Enter " + x + "Elements : ");
        for (int i = 1; i <= x; i++) {

            arr[i] = sc.nextInt();
        }
        int[] preSum = prefixSum(arr);
        System.out.println("Entered number of querries :  ");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter range");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=preSum[r]-preSum[l-1];
            System.out.println("Sum is : "+ ans);
        }
        
        // int l=1,r=arr.length;
        // prifixSum(arr, l, r);
    }
}
