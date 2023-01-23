package Practices;

public class ShowFunc {
    public static void main(String[] args) {
        MyFunction obj = new MyFunction();
        obj.iAmTheShowFunc("hello moto");
    }
    public static class MyFunction{
        void iAmTheShowFunc(String value){
            System.out.println(value);
        }
    }
}
