package OOPs.Overloading;

import java.util.Scanner;

public  class Overloading_1 {
    String talk(){
       return "hello";
   }
    String talk(String name){
       return "hello " + name;
    }
}
class Test extends Overloading_1{
    public static void main(String[] args) {
        Overloading_1 obj = new Overloading_1();
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        System.out.println(obj.talk(value));
    }
}
