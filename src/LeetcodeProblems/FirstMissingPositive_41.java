package LeetcodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FirstMissingPositive_41 {
    public static void main(String[] args) {
        int[] array = {115, 7, 1, 2, 3, 8, 9, 10};
        int result = firstMissingPositive(array);
        System.out.println(result);
    }

    public static int firstMissingPositive(int[] nums) {
        List<Integer> list = IntStream.of(nums).boxed().toList();
        int large = Collections.max(list);
//        for(int i = 0; i < 5; i++ ){
//            if( nums[i] > large){
//                large = nums[i];
//            }
//        }
        int ans = -1;
        for (int j = 1; j < large + 1; j++) {
            if (list.contains(j)) {
                j++;
            }
            if (!list.contains(j)) {
                ans = j;
                break;
            }
        }
            return ans;
    }
}