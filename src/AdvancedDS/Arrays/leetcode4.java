package AdvancedDS.Arrays;

import java.awt.*;
import java.util.Arrays;

public class leetcode4 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7};
        int[] arr1 = {2,4,6,8};

        int[] arrnew = new int[arr.length + arr1.length];
        System.arraycopy(arr, 0, arrnew , 0 , arr.length );
        System.arraycopy(arr1, 0, arrnew , arr.length , arr1.length);

        System.out.println(Arrays.toString(arrnew));
        Arrays.sort(arrnew);
        System.out.println(Arrays.toString(arrnew));

        if((arrnew.length%2) != 0){
            System.out.println( arrnew[((arrnew.length/2) - 1)] + arrnew[arrnew.length/2]);
        }
        else System.out.println( arrnew[Math.abs(arrnew.length/2)]);
    }
}
