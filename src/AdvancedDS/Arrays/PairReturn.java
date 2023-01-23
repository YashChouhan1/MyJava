package AdvancedDS.Arrays;

public class PairReturn {
    static int min;
    int max;
    public PairReturn(int min, int max) {
      this.min = min;
      this.max = max;
    }

    public static void main(String[] args) {
    int[] arr = { 10 ,23, 78, 90 ,34};
    getMinMax(arr);

    System.out.println(min);

    }

    private static PairReturn getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return new PairReturn(min, max);
    }

}
