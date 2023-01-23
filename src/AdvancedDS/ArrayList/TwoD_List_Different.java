package AdvancedDS.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TwoD_List_Different {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);

//        list.set(0, new ArrayList<Integer>());
//        list.set(1, new ArrayList<String>());

        list.add(0);
        list.add(1,21);
        list.add(9);
        list.add(19);
        list.add(29);
        list.remove(2);
        System.out.println("list : " + list);

        //cloning the arraylist
        ArrayList<Integer> cloneList =  ( ArrayList<Integer>)list.clone();
        cloneList.add(53);
        System.out.println("clonelist : " + cloneList);    // prints deep copy of list
        System.out.println("list : " + list);

        // addAll() it add all the element from a collection(i.e. array, arraylist) to arraylist
        ArrayList<Integer> newList = new ArrayList<>();

        newList.addAll(cloneList);
        System.out.println("newlist : " + newList);

        //removeAll()
        newList.removeAll(list);
        System.out.println("newlist after removeAll : " + newList);

        //contains()
        System.out.println(newList.contains(43));

        //get()
        System.out.println(list.get(3));

        newList.add(53);

        //indexOf();
        System.out.println(newList.indexOf(53));

        //subList();
        sublist(cloneList);

        //sor()
        cloneList.sort(Comparator.reverseOrder());
        System.out.println(cloneList);

        //removeIf()
        cloneList.removeIf(integer -> integer/2 != 0);  //removes all odd nos
        System.out.println(cloneList);
     }
      static void sublist(ArrayList<Integer> cloneList) throws IndexOutOfBoundsException{
        System.out.println(cloneList.subList(1,3));
     }
}
