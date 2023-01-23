package JavaConcepts.Generics;

public class printer <T /*extends Human*/> {
    T thingToPrint;
    printer(T input){
        this.thingToPrint = input;
    }
    void print (){
        System.out.println(thingToPrint);
    }
}
class main2 {
    public static void main(String[] args) {
        printer<Integer> obj = new printer<>(10);
        printer<String> obj1 = new printer<>("yash");
        printer<Boolean> obj2 = new printer<>(true);
        printer<Double> obj3 = new printer<>(989809.0898);
        obj.print();
        obj1.print();
        obj2.print();
        obj3.print();
    }
}
