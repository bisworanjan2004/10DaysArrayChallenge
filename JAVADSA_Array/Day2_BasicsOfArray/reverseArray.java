import java.util.Scanner;

public class reverseArray{
    static void reverse(int arr[],int start,int end){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int[] arr,int size){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr={1,5,8,3,6,4};
        printArray(arr, 5);
        reverse(arr, 0, 4);
        System.out.println("Reverse Array is\n");
        printArray(arr, 5);
    }
 }

