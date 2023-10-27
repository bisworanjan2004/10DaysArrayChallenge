package day11ArrayList;
import java.util.ArrayList;

//Basics of ArrayList and its methods  

public class arrayList01 {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        // ArrayList<Boolean> l2=new ArrayList<>();
        // ArrayList<Float> l3=new ArrayList<>();

        // add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        // get an element at index i

        System.out.println(l1.get(1));//6
        //print with for loop
        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));//5,6,7,8 
        }

        //print the arrayList directly
        System.out.println(l1);//[5 6 7 8]
        //adding element some index  i // [5 100 6 7 8]
        l1.add(1,100);//[5 100 6 7 8]
        l1.add(1,1000);//[5 1000 100 6 7 8]
        System.out.println(l1);//finally [5 1000 100 6 7 8]

        //modifying element at index i
        l1.set(1, 10);
        System.out.println(l1);// [5 10 100 6 7 8]

        //removing an element at index i
        l1.remove(1);
        System.out.println(l1);//[5 100 6 7 8]

        //remove an element e
        l1.remove(Integer.valueOf(7));
        // l1.remove(Integer.valueOf(7));//it will remain unchange if not fount
        System.out.println(l1);//[5 100 6  8]

        //it returns boolean values
        System.out.println( l1.remove(Integer.valueOf(7)));//true
        System.out.println( l1.remove(Integer.valueOf(70)));//false

        //checking if an element exists
        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);//true

        //if you don't specify class, you can put anything inside l
        ArrayList l=new ArrayList();
        l.add("psdoso");
        l.add(1);
        l.add(true);
        System.out.println(l);//[psdoso,1,true]
        
    }
}
