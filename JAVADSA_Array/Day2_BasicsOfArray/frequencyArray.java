import java.util.Scanner;

public class frequencyArray {

    static int[] frequencyNumber(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {

            freq[arr[i]]++;

        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int x = sc.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter the elememts : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] freq = frequencyNumber(arr);

        System.out.println("ENter the number of queries : ");
        int q = sc.nextInt();
        while (q > 0) {
            System.out.println("enter number to be searched : ");
            int y = sc.nextInt();
            if (freq[y] > 0) {
                System.out.println("YES it is present and its frequency is : "+freq[y]);
            } else {
                System.out.println("NO");
            }
            q--;
        }

    }

}
