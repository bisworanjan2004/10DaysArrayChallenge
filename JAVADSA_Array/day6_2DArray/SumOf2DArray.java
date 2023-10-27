package day7_2DArray;

import java.util.Scanner;

public class SumOf2DArray {
    static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }

    static void add(int[][] arr1,int[][] arr2,int r1,int c1,int r2,int c2){
        if(r1!=r2 || c1!=c2){
            System.out.println("Wrong input - Addition is not possible ");
            return;
        }
        int[][] sum=new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of the two matrix is : ");
        printArray(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size : ");
        int r1=sc.nextInt();
        System.out.println("Enter column size: ");
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        printArray(arr1);

         System.out.println("Enter 2nd array of row size : ");
        int r2=sc.nextInt();
        System.out.println("Enter column size: ");
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        printArray(arr2);

        add(arr1, arr2, r1, c1, r2, c2);
    }
}
