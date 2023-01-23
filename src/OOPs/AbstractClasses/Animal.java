package OOPs.AbstractClasses;

public abstract class Animal {
    String name;
    int LifeSpan;
    abstract void voice();
}

class cat extends Animal{
    @Override
    void voice() {
        System.out.println("meowww");
    }
    public static void main(String[] args) {
        Animal obj = new cat();
        Animal obj2 = new dog();
        obj.LifeSpan = 15;
        System.out.println(obj.name);
        }
}

class dog extends Animal{
    @Override
    void voice() {
        System.out.println("barkk");
    }
}

class main {
    }

