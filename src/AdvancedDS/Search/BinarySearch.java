package AdvancedDS.Search;

import java.util.Arrays;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 23, 4,45,76,0, 98 ,32,12,56};
        int key = 4;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr) + ", target = " + key);

        int res2 = binarySearch(arr, key);
        System.out.println("Element is at index : " +res2);


        int[] desc_arr = {90,78,56,45,34,23,12,5};
        int target = 90;
        System.out.println(Arrays.toString(desc_arr) + ", target = " + target);
        System.out.println("Element is at index : " + orderAgnosticBinarySearch(desc_arr, target));
    }


    static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length;

        while (low <= high){
            int mid = (low + high )/ 2;

            if(target < arr[mid]){
                high = mid-1;
            } else if ( target > arr[mid]) {
                low = mid + 1;
            } else if ( target == arr[mid]) {
                return  mid;
            }
        }
        return  -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length;

        while (low <= high){
            int mid = (low + high )/ 2;

            if(target > arr[mid]){  //just change the comparison symbol here and
                high = mid-1;
            } else if ( target < arr[mid]) {      //here
                low = mid + 1;
            } else if ( target == arr[mid]) {
                return  mid;
            }
        }
        return  -1;
    }

}
