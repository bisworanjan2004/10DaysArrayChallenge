package day9SpiralMatrixAndTraversal;

import java.util.Scanner;

public class spiralMatrix {
    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int[][] matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalElement=0;
        while(totalElement<r * c){
            //top row -> leftCol to RightCol
            for(int j=leftCol;j<=rightCol && totalElement< r*c;j++){
                System.out.println(matrix[topRow][j]);
                totalElement++;
            }
            topRow++;
            //Rightcol -> topRow to BottomRow
            for (int i = topRow; i <=bottomRow && totalElement< r*c; i++) {
                System.out.println(matrix[i][rightCol]);
                totalElement++;
            }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            for (int k = rightCol; k >= leftCol && totalElement< r*c; k--) {
                System.out.println(matrix[bottomRow][k]);
                totalElement++;
            }bottomRow--;
            //leftCol -> bottomRow to topRow
            for (int k2 = bottomRow; k2 >=topRow && totalElement< r*c; k2--) {
                System.out.println(matrix[k2][leftCol]);
                totalElement++;
            }leftCol++;
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
        printSpiralOrder(arr, r, c);

    }
}
