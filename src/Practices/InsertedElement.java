package Practices;

public class InsertedElement {
    private int[] arr;
    private int target;

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,6};
        int target = 5;

     /*   int ans = 0;
        for(int i = 0; i < arr.length; i++){
            if (target >= arr[i] && target < arr[i+1]){
                ans = i+1;
            }
        }*/
        System.out.println(searchInsert(arr, target));
    }

    public  static int searchInsert(int[] arr, int target) {
        int ans = 0;
        for(int i = 0; i < arr.length ; i++){
            if (target == arr[i] ){
                ans = i;
                break;
            }
            if (target > arr[i] ){
                ans = i+1;
                break;
            }
            if (target >  arr[arr.length - 1]){
                ans = arr.length;
                break;
            }
            if (target ==  arr[arr.length - 1]){
                ans = arr.length-1;
                break;
            }
        }
        return ans;
    }
}
