package LeetcodeProblems;

import java.util.Arrays;

public class MedianOfTwoSortedArray_4 {
    public static void main(String[] args) {
        //int[] arr1 = {1,2,3,4,5};
       // int[] arr2 = {6,7,8,9,10,11};

        int[] arr1 = {1,3};
        int[] arr2 = {2};

        System.out.println(findMedianSortedArrays(arr1, arr2));

    }

    public static float findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] nums3 = new int[m + n];

        System.arraycopy(nums1, 0, nums3 , 0 , m );
        System.arraycopy(nums2, 0, nums3 , m , n);

        Arrays.sort(nums3);
        if((m+n)%2 == 1 ){
            return nums3[(m+n)/2];
        }else
        {
            return (float)( nums3[(m+n)/2] + nums3[(m+n)/2 - 1] )/2 ;
        }

    }
}
