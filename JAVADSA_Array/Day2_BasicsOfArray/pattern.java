import java.util.Scanner;

public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size : ");
        int r = sc.nextInt();
        System.out.println("Enter the column size : ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || i == r || j == 1 || j == c) {

                    System.out.print(" *");
                } else
                    System.out.print("  ");

            }
            System.out.println();

        }
        // System.out.println("<<<<<<<<<<------------------------------->>>>>>>>>>");
        // for (int i = r; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
    }
}
