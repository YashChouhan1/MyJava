package OOPs;

import java.util.Scanner;

public class RectArea {
    public static void main(String[] args) {
    int l , b;
    Rectangle box = new Rectangle(7,8);
  //  System.out.println("enter the dimension : " );
    System.out.println("Area of the Box is : " + box.getArea());
    }
    public static class Rectangle{
        int lenght;
        protected int breadth;

        Rectangle (int l , int b){
            Scanner input = new Scanner(System.in);
            lenght = input.nextInt();
            breadth = input.nextInt();
            ;
        }
        int getArea(){
            int area = lenght * breadth ;
            return area;
        }
    }
}
