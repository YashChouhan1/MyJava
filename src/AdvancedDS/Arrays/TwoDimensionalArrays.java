package AdvancedDS.Arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        //int[][] arr2D = new int[3][];

        int[][] arr2D = {
                {1,2,3},
                {4,5,5},
                {6,7,8}
        };

        System.out.println(Arrays.toString(arr2D[2]));
        System.out.println(Arrays.toString(new int[]{arr2D[1][1]}));

        arr2D[2][1] = 7;

        System.out.println(Arrays.deepToString(arr2D));

        for (int row = 0 ; row < arr2D.length ; row++){
            for (int column = 0 ; column < arr2D[row].length ; column++){
                System.out.print(arr2D[row][column] +" ");
            }
            System.out.println();
        }

//        for (int row =0 ; row < arr2D.length ; row++){
//            for (int[] a: arr2D) {
//                System.out.println(Arrays.toString(arr2D[row]));
//            }
//        }
    }
}
