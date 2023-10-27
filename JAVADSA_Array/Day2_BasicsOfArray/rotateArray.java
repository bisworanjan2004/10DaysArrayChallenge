import java.util.Scanner;

public class rotateArray {

    static int[] Rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the K : ");
        int k = sc.nextInt();
        System.out.println("Originala array : ");
        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]);
        }
        int[] val = Rotate(arr, k);
        System.out.println("After Rotation : ");
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }
    }
}
