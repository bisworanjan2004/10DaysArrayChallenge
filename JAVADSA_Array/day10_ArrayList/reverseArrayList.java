package day11ArrayList;

import java.util.ArrayList;

import java.util.Collections;

public class reverseArrayList {
    static void reverseList(ArrayList<Integer> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;

        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);//0
        list.add(10);//0 10
        list.add(3);//0 10 3
        list.add(5);//0 10 3 5
        list.add(22);//0 10 3 5 22
        list.add(10);//0 10 3 5 22 10
        System.out.println("Original lIst" + list);// [0,10,3,5,22,10]
        reverseList(list);
        // Collections.reverse(list);// predefine methode inside collections package
        System.out.println("Reversed list" + list);// [10,22,5,3,10,0]
        Collections.sort(list);//it will make the arrayList arranged in ascending order
        System.out.println("Ascending order : "+list);
        Collections.sort(list,Collections.reverseOrder());//reverseorder comparater(used in which order we want to sort)
        System.out.println("Descending order : "+list);

        ArrayList<String> l1=new ArrayList<>();
        l1.add("WelCome");
        l1.add("TO");
        l1.add("My");
        l1.add("Coding");
        Collections.sort(l1);
        System.out.println("Sorted "+l1);//[Coding,My,To,Welcome] due to lexicography of alphabates
    }
}
