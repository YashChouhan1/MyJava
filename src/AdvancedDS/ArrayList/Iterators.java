package AdvancedDS.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');
        list.add('F');

        Iterator<Character> iterators =  list.iterator();

        int index = 0;
        while(iterators.hasNext()){
            if(iterators.next().describeConstable().isEmpty()){
                System.out.print(list.get(index));
                break;
            }
            System.out.print(list.get(index) + " -> ");
            index++;
        }
            System.out.print("END");
    }
}
