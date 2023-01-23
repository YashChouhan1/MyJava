package OOPs.Inheritence_Polymorphism.Inher_set1;

public class Test1 {
    public static void main(String[] args) {
    A obj1 = new B(); /* here I passed B as obj but still it printing the value which is initialized
                         in the A*/
    B obj2 = new B();

    System.out.println(obj1.a);
    System.out.println(obj2.a);
    System.out.println(obj1.a);

    }
}
 class A{
    int a = 30;
 }
 class B extends  A{
    int a = 50;
}