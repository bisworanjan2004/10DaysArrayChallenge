package day8MultiArray;

import java.util.Scanner;

public class rotate90degreeSQMatrix {
    static void printArray(int[][] array, int r,int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
   static void reverse(int[] arr){
    int i=0,j=arr.length-1;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }
   }

    static void transposeArray(int[][] arr1,int r,int c){
        int temp=0;
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                temp=arr1[i][j];
                arr1[i][j]=arr1[j][i];
                arr1[j][i]=temp;
            }
        }
        //In this swpping methode we can only transpose square matrixes 
    }
    static void swapMatrix(int[][] arr,int r,int c){
       transposeArray(arr, r,r);
       for (int i = 0; i < r; i++) {
        reverse(arr[i]);
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column size : ");
        int r1 = sc.nextInt();
       
        int[][] arr1 = new int[r1][r1];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < r1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("matrix is : ");
        printArray(arr1, r1,r1);
        System.out.println("The rotation of the matrix about 90 degree is : ");
       
        
        swapMatrix(arr1, r1,r1);

        printArray(arr1, r1,r1);
    }
}
