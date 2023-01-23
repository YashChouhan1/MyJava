package AdvancedDS.Arrays;

import java.util.Arrays;

public class CompareArray {
    public static void main(String[] args) {
        int[] arr1 = { 12,34,56,78,90 };
        int[] arr2 = { 63, 45 ,17 ,76, 90};

        System.out.println(Arrays.stream(arr1));
        System.out.println(Arrays.hashCode(arr1));
        System.out.println(Arrays.deepHashCode(new int[][]{arr1}));

        System.out.println("\n" + Arrays.hashCode(arr2));
        System.out.println(Arrays.deepHashCode(new int[][]{arr2}));
        Arrays.parallelSort(arr2);
        System.out.println(Arrays.toString(arr2));
        Arrays.parallelPrefix(arr1, (x, y) -> x + y);
        System.out.println(Arrays.toString(arr1));
    }
}
