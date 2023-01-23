package LeetcodeProblems;

public class Richest_Customer_Wealth_1672 {
    public static void main(String[] args) {
        int[][] arr = {
                        {2,3,4},
                        {2,4,5,9},
                        {3,4,2,9},
                        {1,4,5}
                      };

        System.out.println(maximumWealth(arr));
    }

    private static int maximumWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        int element;
        for (int i = 0; i < accounts.length; i++) {
            element = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                element += accounts[i][j];
            }
            arr[i] = element;
        }

        int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }


    private static int maximumWealth2(int[][] accounts) {
        int[] arr = new int[accounts.length];
        int element;
        for (int i = 0; i < accounts.length; i++) {
            element = 0;
            for (int j = 0; j < accounts[i].length - 1 ; j++) {

                 element = accounts[i][j] + accounts[i][j +1];
                 accounts[i][j +1] = element;

            }
           arr[i] = element;
        }

        int max = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}
