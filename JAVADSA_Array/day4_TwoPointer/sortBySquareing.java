package day5TwoPointer;

import java.util.Scanner;

public class sortBySquareing {
    static int[] swap(int[] arr, int left, int right) {
        int temp = 0;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        return arr;
    }

    static void reverse(int[] arr) {
        int i = 0, j = arr.length-1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;

        }
    }

    static int[] sortSquare(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
             
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elememts in non decreasing order : ");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        int[] ans=sortSquare(arr);
        reverse(ans);
        System.out.println("The sorted array is : ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(" "+ans[i]);
        }
        
    }
}
