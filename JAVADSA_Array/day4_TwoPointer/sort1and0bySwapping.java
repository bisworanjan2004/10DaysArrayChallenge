package day5TwoPointer;

import java.util.Scanner;

//01)sort an array consisting of 0 o=and 1 e.g (0000111)
//02) sort an array even or odd basis 1st even then odd numbers like e.g (24861375)

public class sort1and0bySwapping {
    static int[] swap(int[] arr, int left, int right) {
        int temp = 0;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return arr;
    }

    // static void sortZeroesAndOneInPlace(int[] arr) {
    //     int n = arr.length;
    //     int left = 0, right = n - 1;
    //     while (left < right) {
    //         if (arr[left] == 1 && arr[right] == 0) {
    //             swap(arr, left, right);
    //             left++;
    //             right--; 

    //         }
    //         if (arr[left] == 0) {
    //             left++;
    //         }
    //         if (arr[right] == 1) {
    //             right--;
    //         }
    //     }

    static void SortArrayByparity(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left]%2 == 1 && arr[right]%2 == 0) {
                swap(arr, left, right);
                left++;
                right--;

            }
            if (arr[left]%2 == 0) {
                left++;
            }
            if (arr[right]%2 == 1) {
                right--;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr);
        // }
        // return arr;
        System.out.println("Sorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elememts have only 0 and 1 : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
            
        }

        SortArrayByparity(arr);

    //    sortZeroesAndOneInPlace(arr);
        // int[] ans=sortZeroesAndOneInPlace(arr);
        // System.out.println("Sorted array is : ");
        // for (int i = 0; i < ans.length; i++) {
        //     System.out.println(ans[i]);
        // }
    }
}