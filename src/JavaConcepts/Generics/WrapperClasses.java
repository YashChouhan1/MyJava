package JavaConcepts.Generics;

public class WrapperClasses {
    public static void main(String[] args) {
        String i = "0";
        String obj = i;
        if (obj == null) {
            System.out.println("null");
        }
        else
            System.out.println("Not Null");       //(Autoboxing)

        Integer j = new Integer(8);
        int i1 = j.intValue();                    //(Unboxing)
        System.out.println(i1);
    }
}
