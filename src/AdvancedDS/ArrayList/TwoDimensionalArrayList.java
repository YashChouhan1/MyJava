package AdvancedDS.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList[][] list = new ArrayList[3][3];

        list[0][0] = new ArrayList<>();

        list[0][0].add("one");
        list[0][0].add("two");
        list[0][0].add("three");

        list[1][1] = new ArrayList<>();

        list[1][1].add("four");
        list[1][1].add("five");
        list[1][1].add("six");

        list[2][2] = new ArrayList<>();

        list[2][2].add("seven");
        list[2][2].add("eight");
        list[2][2].add("nine");


        for (int row = 0; row < list.length; row++) {
           System.out.println(Arrays.deepToString(list[row]));
           System.out.println();
        }


        System.out.println();
        System.out.println(Arrays.deepToString(list));
    }
}
