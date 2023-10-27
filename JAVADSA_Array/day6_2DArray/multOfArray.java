package day7_2DArray;

import java.util.Scanner;

public class multOfArray {
    static void printArray(int[][] array,int r,int c){
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }

    static void multiplication(int[][] arr1,int[][] arr2,int r1,int c1,int r2,int c2){
        if(c1!=r2){
            System.out.println("Wrong - This matrix can not be multiplied ");
            return;
        }
        int[][] mul=new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int j2 = 0; j2 < c1; j2++) {
                    mul[i][j]+=(arr1[i][j2]*arr2[j2][j]);
                }
            }
        }
        System.out.println("Myultiplication of two matrix is : ");
        printArray(mul,r1,c2);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size : ");
        int r1=sc.nextInt();
        System.out.println("Enter column size: ");
        int c1=sc.nextInt();
        int[][] arr1=new int[r1][c1];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
        // printArray(arr1,r1,c1);

         System.out.println("Enter 2nd array of row size : ");
        int r2=sc.nextInt();
        System.out.println("Enter column size: ");
        int c2=sc.nextInt();
        int[][] arr2=new int[r2][c2];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("1st matrix is : ");
        printArray(arr1, r1, c1);
        System.out.println("2nd Matrix is : ");
        printArray(arr2,r2,c2);
        
        multiplication(arr1, arr2, r1, c1, r2, c2);
    }
}
