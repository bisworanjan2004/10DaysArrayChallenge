package day6Pattern;

import java.util.Scanner;

public class prefixsum {
    static void preintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
    }
    static int[] prefsum(int[] arr){
        int n=arr.length;
        int[] pref=new int[n];
        pref[0]=arr[0];
        for (int i = 1; i < n; i++) {
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter "+x+ "Elements");
        for (int i = 0; i < arr.length; i++) {

            arr[i] = sc.nextInt();
        }
        System.out.println("The entered array is : ");
        preintArray(arr);
        System.out.println("After prefix sum the new array is : ");
        int[] ans=prefsum(arr);
        preintArray(ans);
    }
}
