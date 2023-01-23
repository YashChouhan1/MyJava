package OOPs.Basic_OopConcept;

public class Singleton {
    public static Singleton name = null;
    public String str;
    private Singleton(){
        str = "hello i am useless";
    }
    public static Singleton getInstance(){
        if(name == null){
            name = new Singleton();
        }
        return name;
    }
}

class Demo {
    public static void main(String[] args) {

        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        Singleton z = Singleton.getInstance();

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        System.out.println(x.name);

    }
}