package LeetcodeProblems;

public class FindingNoWith_EvenNo_1295 {
    public static void main(String[] args) {
        //int[] arr = {12,32311,34,555,5678,877,666666, 1212};
        int[] arr = {0};

        System.out.println(findNumbers(arr));
        //System.out.println(Math.log10(arr[1]) + 1);
    }

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
           if (((int) Math.log10(nums[i]) + 1 ) % 2 == 0){
               count++;
           }
        }
        return count;
    }
}
