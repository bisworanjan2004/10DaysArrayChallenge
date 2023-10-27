import java.lang.reflect.Array;
import java.util.Scanner;

public class reverseArray2 {
    static void reverseArr(int[] arr){
        int n=arr.length;
        int[] ans =new int[n];
        int j=0;
        for (int i = arr.length-1; i >=0; i--) {
            ans[j++]=arr[i];
        }
        System.out.println("The reverse array is : ");
        for ( j = 0; j < ans.length; j++) {
            System.out.println(ans[j]);
        }
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
        reverseArr(arr);
    }
}
