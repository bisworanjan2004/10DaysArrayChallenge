import java.util.Scanner;

public class sumPairInArray {
    public static void main(String[] args) {
        int[] arr=new int[7];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 7 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number : ");
        int x=sc.nextInt();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int j2 = j+1; j2 < arr.length; j2++) {
                    
                    if(arr[i]+arr[j]+arr[j2]==x){
                        count++;
                    }
                }

            }
        }
        System.out.println("We found "+count+" number of pair");
    }
}
