package day8MultiArray;

import java.util.Scanner;

public class transpose {
    static void printArray(int[][] array, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
    // static void transposeArray(int[][] arr1,int r1,int c1){
        
    //     for (int i = 0; i < c1; i++) {
    //         for (int j = 0; j < r1; j++) {
    //             System.out.print(" "+arr1[j][i]);
    //         }
    //         System.out.println();
    //     }
    // }

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size : ");
        int r1 = sc.nextInt();
        System.out.println("Enter column size: ");
        int c1 = sc.nextInt();
        int[][] arr1 = new int[r1][c1];
        System.out.println("Enter the elements of array : ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
       
        System.out.println("1st matrix is : ");
        printArray(arr1, r1, c1);
        System.out.println("The transpose of the matrix is : ");
       
        transposeArray(arr1,r1,c1);
        printArray(arr1, r1, c1);
    }
}
