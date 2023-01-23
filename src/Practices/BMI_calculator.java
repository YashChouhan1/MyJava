package Practices;

import java.util.Scanner;

public class BMI_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in meters : ");
        float height = input.nextFloat();
        {
            if (height > 2.5 || height < 1) {
                System.out.println("Abnormal height!!");
            }
        }
       // System.out.println();
        System.out.print("Enter your weight in kgs : ");
        int weight = input.nextInt();
        {
            if (weight > 500 || weight < 5) {
                System.out.println("Abnormal weight!!");
            }
        }
        if (height >= 1 && height <= 2.5 && weight >= 5 && weight <= 500) {
            bmiCal(weight, height);
        }
        else System.out.println("Wrong entry of data!!");
    }
    private static void bmiCal(int weight, float height) {
        float result = weight / (height*height);
        System.out.println("------------------------");
        System.out.println("Your BMI value is : " + result);

        if ( result < 19 ){
            System.out.println("You are Underweight :(");
        }
        if ( result > 25 ){
            System.out.println("You are Overweight :(");
        }
        if ( result >= 19 && result <= 25 ) {
            System.out.println("You are healthy :)");
        }
    }
}
