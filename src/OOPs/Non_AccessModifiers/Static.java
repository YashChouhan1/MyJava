package OOPs.Non_AccessModifiers;

class Static {
    static int i = 0;
    final void my_method(){
        System.out.println("hello");
    }
}
class Non_Static extends Static{
    int j = 0;
//    void my_method(){
//        System.out.println("broo");
//    }
}
class Main{
    public static void main(String[] args) {
        Non_Static obj = new Non_Static();
        System.out.println(Static.i);
        obj.my_method();
        Main2 obj2 = new Main2();
        obj2.method();
        //System.out.println(Non_Static.j); --> Compile Time Error
    }
}