package OOPs.Basic_OopConcept;

public class Super_keyword {
    int value = 200;
    void m(){
        System.out.println("Base Class");
    }
    Super_keyword(){
        System.out.println("1");
    }
    Super_keyword(int num){
        System.out.println(num);
    }
    Super_keyword(int num1, int num2){
        System.out.println(num1+num2);
    }
}

class super2 extends Super_keyword{
    int value = 2000;

    void m(){
        super.m();
        System.out.println(super.value);
    }
    super2(){
        super(10);
        this.m();
    }

    public static void main(String[] args) {
        Super_keyword obj1 = new super2();
        super2 obj = new super2();
//        obj.m();

    }
}