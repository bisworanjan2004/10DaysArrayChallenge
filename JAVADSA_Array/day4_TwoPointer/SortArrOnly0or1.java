package day5TwoPointer;

import java.util.Scanner;

public class SortArrOnly0or1 {
    static void sortArray(int[] arr,int x){
        int[] ans=new int[x];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(i<count){
                ans[i]=0;
            }
            else{
                ans[i]=1;
            }
        }
        System.out.println("The sorted array is : ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(" "+ans[i]);
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
            if(arr[i]>1 || arr[i]<0){
                System.out.println("Worng input : ");
                return ;
            }
        }
        sortArray(arr, x);
    }
}
