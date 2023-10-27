package day6Pattern;

import java.util.Scanner;

public class TowSubArray {
    static int findArraySum(int[] arr){
        int totalSum=0;
        for (int i = 0; i < arr.length; i++) {
            totalSum+=arr[i];
        }
        return totalSum;
    }
    static boolean equalSumPartition(int[] arr){
       int totalSum=findArraySum(arr);
       int preSum=0;
       for (int i = 0; i < arr.length; i++) {
        preSum+=arr[i];
        int suffixSum=totalSum-preSum;
        if(suffixSum==preSum){
            return true;
        }
       }
       return false;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter " + x + "Elements : ");
        for (int i = 0; i < x; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("Equal partition possible : "+equalSumPartition(arr));
        
    }
}
