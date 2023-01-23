package AdvancedDS.Search;

public class LinearSearch_In2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {1,3,4,5},
                {2,45,67,89},
                {9,87,76,6},
                {34,78,32,54,99},
                {0}
        };

        int target = 0;

        for (int row  = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if(arr[row][column] == target){
                    System.out.println("row : "+ (row+1) + "\ncolumn : " + (column+1));
                }
            }
        }
    }
}
