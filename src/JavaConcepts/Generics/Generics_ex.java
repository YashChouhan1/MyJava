package JavaConcepts.Generics;

public class Generics_ex <T> {
    T this_number;

    Generics_ex( T number){
        this.this_number = number;
    }

    void print(){
        System.out.println(this_number);
    }

    public static void main(String[] args) {
        Generics_ex<String> obj = new Generics_ex<>("using generic \nvia constructor call");
        obj.print();
    }
}
