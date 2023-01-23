package OOPs.Inheritence_Polymorphism;

/* In this way overriding works , in overriding basically method/function with same name are passed
   within different classes. This is also called RUNTIME POLYMORPHISM because it checks at runtime
   by which object it was called*/

public class Overriding {
    public static void main(String[] args) {
        Shapes shape = new Circles();    // from here... class different - Constructor diff.
        Circles circle = new Spheres();
        Squares square = new Squares();
        Spheres sphere = new Spheres();
        circle.fun();
        square.fun();
        shape.fun();
    }
    static class Shapes{
       void fun(){
           System.out.println("i am in shape");
       }
    }
    static class Squares extends Shapes{
        void fun(){
            System.out.println("i am in square");
        }
    }
    static class Circles extends Shapes{
        void fun(){
            System.out.println("i am in circle");
        }
    }
    static class Spheres extends Circles{
        void fun(){
            System.out.println("i am in sphere");
        }
    }
}
