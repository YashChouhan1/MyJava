package OOPs;

import java.util.Arrays;

public  class CustomArraylist {
    private static int[] arr;
    private int size = 0;

    public CustomArraylist(){
        int DEFAULT_SIZE = 5;
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            reSize();
        }
      arr[size++] = num;
    }
    private boolean isFull() {
        return size == arr.length;
    }
    int[] temp;
    private void reSize(){
        int[] temp = new int[ 2 * arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
    }

//    private void remove( int i){
//        for (int j = i; j < temp.length; j++) {
//            temp[i+1] = temp[i];
//        }
//    }
    private int remove(){
        int removed = arr[--size];
        return removed;
    }
    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();
        list.add(5);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(1);
        list.add(3);
        System.out.println(Arrays.toString(arr));
        System.out.println(list.remove());
        System.out.println(Arrays.toString(arr));
    }
}
