package OOPs.Comparing_Objects;

public class TypesOfVariables {
    int  num = 0;
    static boolean ans = true;

    void method (){
    }
    TypesOfVariables(){
        System.out.println("hello i am yash");
        //num = 100;
    }
    TypesOfVariables(int value){
        num = value;
    }

    public static void main(String[] args) {
        TypesOfVariables obj1 = new TypesOfVariables();
        TypesOfVariables obj2 = new TypesOfVariables(200);

        System.out.println(obj1.num);
        System.out.println(obj2.num);
        TypesOfVariables obj3 = new TypesOfVariables();

    }
}
