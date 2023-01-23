package AdvancedDS.Search;

import java.util.Arrays;

public class BinarySearch_In2D_Array {
    public static void main(String[] args) {
        int[][] nums = {
                        {12, 15, 20, 25},
                        {16, 18, 22, 28},      // Sorted Array like sudoku
                        {19, 21, 24, 30}
                     };
        int target = 24;

        System.out.println(Arrays.toString(search(nums, target)));
    }

     static int[] search(int[][] nums, int target) {
        int row = 0;
        int column = nums.length - 1;

        while ( row < nums.length && column >= 0){
            if(nums[row][column] == target){
                return new int[]{row, column};
            }
            if( target < nums[row][column]){
                column--;
            }
            if(target > nums[row][column]){
                row++;
            }
        }
        return new int[]{-1, -1};
    }
}
