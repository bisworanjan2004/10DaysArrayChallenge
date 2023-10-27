package day9SpiralMatrixAndTraversal;

import java.util.Scanner;

public class generateSpiralMatrix {

    static void printArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] GenerateSpiralOrder(int n){
        int[][] matrix=new int[n][n];
        int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
        int count=1;
        while(count<=n * n){
            //top row -> leftCol to RightCol
            for(int j=leftCol;j<=rightCol && count<= n*n;j++){
                matrix[topRow][j]=count++;
                
            }
            topRow++;
            //Rightcol -> topRow to BottomRow
            for (int i = topRow; i <=bottomRow && count<= n*n; i++) {
                matrix[i][rightCol]=count++;
            }
            rightCol--;
            //bottomRow -> rightCol to leftCol
            for (int k = rightCol; k >= leftCol && count<= n*n; k--) {
               matrix[bottomRow][k]=count++;
            }bottomRow--;
            //leftCol -> bottomRow to topRow
            for (int k2 = bottomRow; k2 >=topRow && count< n*n; k2--) {
               matrix[k2][leftCol]=count++;
            }leftCol++;
        }
        return matrix;
        // System.out.println("The spiral matrix elements are");
        // printArray(matrix);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter row size of the matrix: "); 
        int n=sc.nextInt();
        
        
        int[][] arr=GenerateSpiralOrder(n);
        printArray(arr);

    }


}
