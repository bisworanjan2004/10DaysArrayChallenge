 import java.util.Arrays;
import java.util.Scanner;
 class kthSmallKtjLargeElement{

    static void kth(){
        int[] arr={2,4,5,7,6,3};
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println(arr[i]);
        }
        System.out.println("The Sorted array is : ");
        Arrays.sort(arr);
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
        int small=arr[0];
        int large=arr[arr.length-1];
        System.out.println("Smallest : "+small);
        System.out.println("Largest : "+large);
        System.out.println("Enter  the kth position smallest number  ");
        Scanner sc=new Scanner(System.in);
        int kthSmall=sc.nextInt();
        System.out.println("Enter the index of the kth Largest number ");
        int kthLarge=sc.nextInt();
        for(small=0;small<arr.length-1;small++){
            if(small==kthSmall-1){

                System.out.println("The kth smallest element is : "+arr[small]);
                break;
            }
        }
        for(large=arr.length;large>=small;large--){
            if(large==arr.length-kthLarge){
                System.out.println("The kth Largest element is : "+arr[large]);
            }
        }
        }
    public static void main(String[] args) {
        kthSmallKtjLargeElement obj=new kthSmallKtjLargeElement();
        kth();
    }
}