package OOPs.Overloading;

 @SuppressWarnings("ALL")
 class BaseClass {
    public void display() {
        System.out.println("In the base class,test() method");

        }
        @Deprecated void show() {
            System.out.println("I am Deprecated");
    }

    static class ChildClass extends BaseClass {

        public void display() {
            System.out.println("In the child class, test() method");
        }
    }

    // main class
     public class OverrideAnnotationTest {
        public static void main(String[] args) {
            System.out.println("@Override Example");
            BaseClass test = new ChildClass();
            test.display();
            test.show();
        }
    }
}
