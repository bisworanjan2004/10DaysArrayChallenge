import java.util.Scanner;

public class uniqueElement {
    public static void main(String[] args) {
        int[] arr=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 7 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                    arr[i]=-1;
                }
            }
        }
         System.out.println("The uniqueor unrepeated elements are : ");
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>0){
            System.out.println(arr[i]);

           }
        }
        // System.out.println("The unique elements are : ");
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]!=-1){
                
        //     }
        //     System.out.println(arr[i]);
        // }
    }
}
