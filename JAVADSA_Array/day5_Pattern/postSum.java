package day6Pattern;

import java.util.Scanner;

public class postSum {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static int[] postArraySum(int[] arr){
        int n=arr.length;
        int[] totalSum=new int[n];
        totalSum[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            totalSum[i]=totalSum[i+1]+arr[i];
        }
        return totalSum;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter "+x+ " Elements");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is : ");
        printArray(arr);
        System.out.println("After the postSum the array will be : ");
        int[] ans=postArraySum(arr);
        printArray(ans);
    }
}
