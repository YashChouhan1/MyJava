package AdvancedDS.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 0, 23, 56, 78, 12, 45, 67, 8, 90, 9, 76, 4, 32, 42};
        int key = 90;
        int flag = -1;

        for (int i = 0; i < arr.length ; i++) {
            if (key == arr[i]) {
              System.out.println("Element is at index : " + i);
              flag++;
            }
        }
        if(flag == -1){
            System.out.println("Element not found!!");
        }
    }
}
