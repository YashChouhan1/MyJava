package OOPs.AbstractClasses;

public class Abstract_2 {
        public abstract static class Animal {
            abstract void vocals();
        }
        public static class Cat extends Animal {
            void vocals(){
                System.out.println("i meow");
            }
        }
        public static class Dog extends Animal {
            void vocals() {
                System.out.println("i bark");
            }
        }
        public static void main(String[] args) {
            Animal obj1 = new Cat();
            Animal obj2 = new Dog();
            obj1.vocals();
            obj2.vocals();
        }
    }
