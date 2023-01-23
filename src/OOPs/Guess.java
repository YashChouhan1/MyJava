package OOPs;

import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        int randomNum = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome In Guessing Game");

        System.out.print("Guess the no. - ");
        int num = input.nextInt();
        while (num != randomNum){

        }
    }
    void check(int num , int randomNum){
            if (num > randomNum) {
                System.out.println("Guess something smaller!!");
            }
            if (randomNum > num) {
                System.out.println("Guess something higher!!");
            }
            if (randomNum == num) {
                System.out.println("CONGO:) - ^Correct Guess^");
            }
    }
}
