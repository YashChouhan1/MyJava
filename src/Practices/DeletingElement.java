package Practices;

import java.util.Arrays;

public class DeletingElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
      //  int count = 0 , j = 0;

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[count] = nums[i];
            count++;
            }
        System.out.println(Arrays.toString(nums));
        }
    }

