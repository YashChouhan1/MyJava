package OOPs.AbstractClasses;

public class Abstract_1 {
     public abstract  class Parent {
         abstract void message();
     }
     public  class Son1 extends Parent{
         void message(){
             System.out.println("i am with son 1");
         }
     }
    public  class Son2 extends Parent {
        @Override
        void message() {

            System.out.println("i am with son 2");
        }
        // void message() {

    }
    public void main(String[] args) {
        Parent obj1 = new Son1();
        Parent obj2 = new Son2();
        obj1.message();
        obj2.message();
    }
}
