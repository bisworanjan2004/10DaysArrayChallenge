package day8MultiArray;

import java.util.Scanner;

public class pascalTriangle {
    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n) {
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            // ith row has i+1 column
            arr[i] = new int[i + 1];
            // 1st and last element of every row is 1
            arr[i][0] = arr[i][i] = 1;

            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int r1 = sc.nextInt();

        int[][] ans = pascal(r1);
        printArray(ans);
    }
}
