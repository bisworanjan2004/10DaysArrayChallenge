import java.util.Scanner;

public class swapNumber {
    // int temp = 0;
    int a,b;

    static void swapwithouttemp(int a, int b) {
        
        a=a+b;;
        b=a-b;
        a=a-b;
        System.out.println("After swapping the value of a : "+a+" The value of b is : "+b);

    }
    // static void swap(int a, int b) {
        
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("After swapping the value of a : "+a+" The value of b is : "+b);

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number to swap using third variable : ");
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Before swapping the value of a is : "+x+" and value of b is : "+y);
        swapwithouttemp(x,y);

    }

} 
