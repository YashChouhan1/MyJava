package AdvancedDS.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array1  extends Thread implements Runnable{
public static void main(String[] args) throws InterruptedException {
    int[] arr = new int[5];
    String[] str = new String[2];
    boolean[] bool = new boolean[2];
    Array1 obj = new Array1();
    Array1 obj2 = new Array1();
    Scanner input = new Scanner(System.in);

    int[] arr1 = {1, 2, 3, 45, 5};
    for (int num : arr1) {
        System.out.println(num);

    }
   System.out.println(Arrays.toString(arr));
    obj.start();
    obj2.start();
    obj.wait(5);
    Thread();;
    Arrays.stream(arr).count();
}
 static void Thread(){
    System.out.println("hello" );
 }
}

class arraylist{

}