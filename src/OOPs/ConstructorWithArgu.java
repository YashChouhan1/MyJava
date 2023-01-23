package OOPs;

public class ConstructorWithArgu {
    public static void main(String[] args) {
        Triangle t = new Triangle(47,58);
        System.out.println("Area : "+t.area());
    }
    static class Triangle{
       int a, b;
       Triangle(int x ,int y){
           a = x;
           b = y;
       }

       float area(){
         return (0.5f*a*b);
        }
    }
}
