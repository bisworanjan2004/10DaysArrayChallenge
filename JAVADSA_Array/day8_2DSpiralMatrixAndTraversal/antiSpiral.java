package day9SpiralMatrixAndTraversal;

import java.util.Scanner;

public class antiSpiral {
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printAntiSpiralOrder(int[][] matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElement=0;
        while(totalElement<r * c){
            //Leftcol -> topRow to bottomRow
            for(int j=topRow;j<=bottomRow && totalElement< r*c;j++){
                System.out.println(matrix[j][leftCol]);
                totalElement++;
            }
            leftCol++;
            //bottomRow -> leftCol to rightCol
            for (int i = leftCol; i <=rightCol && totalElement< r*c; i++) {
                System.out.println(matrix[bottomRow][i]);
                totalElement++;
            }
            bottomRow--;
            //rightCol -> bottomRow to topRow
            for (int k = bottomRow; k >= topRow && totalElement< r*c; k--) {
                System.out.println(matrix[k][rightCol]);
                totalElement++;
            }rightCol--;
            //topRow -> rightCol to leftCol
            for (int k2 = rightCol; k2 >=leftCol && totalElement< r*c; k2--) {
                System.out.println(matrix[topRow][k2]);
                totalElement++;
            }topRow++;
        }
        // System.out.println("The spiral matrix elements are");
        // printArray(matrix);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size of the matrix: ");
        int r=sc.nextInt();
        System.out.println("Enter the column size : ");
        int c=sc.nextInt();
        int[][] arr=new int[r][c];
        System.out.println("Enter "+r*c+" element of the matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Entered matrix is : ");
        printArray(arr);
        System.out.println("The spiral order of the above matrix is : ");
        printAntiSpiralOrder(arr, r, c);

    }
}
