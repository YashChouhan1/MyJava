package Practices;

import java.util.Scanner;

public class codechef1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 0;
        while (i < num) {
            int x1 = input.nextInt();
            int x2 = input.nextInt();
            int y1 = input.nextInt();
            int y2 = input.nextInt();

            if ((y1 / x1) > (y2 / x2)) {
                System.out.println("1");
            }
            if ((y1 / x1) < (y2 / x2)) {
                System.out.println("-1");
            }
            if ((y1 / x1) == (y2 / x2)) {
                System.out.println("0");
            }
            i++;
        }
    }
}
