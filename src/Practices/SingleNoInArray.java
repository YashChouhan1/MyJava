package Practices;

public class SingleNoInArray {
    //import java.util.Arrays;

        public static void main(String[] args) {
            int[] arr = {4,3,5,1,3,1,5};
            int result = 0;
            for (int i = 0; i < arr.length ; i++) {
                result ^= arr[i];
            }
            System.out.println(result);
        }
    }
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - i - 1; ++j) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//
//                }
//            }
//        }
//        int k = 0;
//        for (int num : arr) {
//            if (arr[k] != arr[k + 1]) {
//                System.out.println(arr[k] + " ");
//                break;
//            }
//        }
//    }
//}


