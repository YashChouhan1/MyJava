package OOPs.Basic_OopConcept;

public class this_keyword {
    int a;      // here this is used as To refer current class instance variable.
    float b;
    String c;

    this_keyword (int a , float b, String c)
    {
        this.a = a ;
        this.b = b;
        this.c = c;
    }

    Void display(){
        System.out.println(a + " "+ b + " " + c);
        return null;
    }
    public static void main(String[] args) {
        this_keyword obj = new this_keyword(1, 2,"yash");
        obj.display();
    }
}

class This2{
    void method(){        // To invoke current class method.
                           // but not mandatory to use.
                         // compiler will automatically add that.
        System.out.println("hello");
    }

    void another_method(){
        this.method();
        System.out.println("world");
    }

    public static void main(String[] args) {
        This2 obj = new This2();
        obj.another_method();
    }
}

class This3{
                 // to invoke current class constructor
    This3(){
        System.out.println("in default constructor");
    }

    This3(String str){
        this();
        System.out.println("in parametrized constructor of base class");
    }

    public static void main(String[] args) {
        This3 obj = new This3("in parametrized constructor");
    }
}

class This4 extends This3{
                              // constructor chaining
    This4(){
        System.out.println("in default constructor");
    }

    This4(String str){
        super(str);
        System.out.println(str);
    }

    public static void main(String[] args) {
        This4 obj = new This4("in parametrized constructor of derived class");
    }
}
