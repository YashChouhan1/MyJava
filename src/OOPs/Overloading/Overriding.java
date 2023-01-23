package OOPs.Overloading;

public class Overriding {
    void print(){
        System.out.println("In Parent Class");
    }
}

class child1 extends Overriding{
    void print(){
        System.out.println("In 1st child");
    }


//class child2 extends child1 {
//    void print(){
//        System.out.println("In  2nd child");
//    }
//}
//
//class child3 extends child2 {
//    void print(){
//        System.out.println("In 3rd child");
//    }

    public static void main(String[] args) {
      Overriding obj = new Overriding();
      Overriding obj2 = new child1();
      // child1 obj3 = (child1) new Overriding();
      // child2 obj4 = new child2();
      // obj3.print();
      obj.print();
      obj2.print();
    }
}


