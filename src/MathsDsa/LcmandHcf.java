package MathsDsa;

import java.util.Scanner;

public class LcmandHcf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first no.  : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second no. : ");
        int num2 = input.nextInt();
        System.out.println("");
        int res1 =  hcf(num1, num2);
        int res2 =  lcm(num1, num2);
        System.out.println("HCF Of "+num1+" & "+num2+" is "+ res1);
        System.out.println("LCM Of "+num1+" & "+num2+" is "+ res2);
    }
    static int hcf(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        else
            return hcf(num2 % num1, num1);
    }
    static int lcm(int num1, int num2) {
        return (num1 * num2) / hcf(num1, num2);
    }
}
