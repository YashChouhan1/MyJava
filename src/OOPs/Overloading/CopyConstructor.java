package OOPs.Overloading;

public class CopyConstructor {

    int num;
    CopyConstructor(int number){
        num = number;
    }
    CopyConstructor(CopyConstructor obj){
        num = obj.num;
    }
    void display(){
        System.out.println(num);
    }
}
 class main{
     public static void main(String[] args) {
         CopyConstructor obj1 = new CopyConstructor(90);
         CopyConstructor obj2 = new CopyConstructor(obj1);
         obj1.display();
         obj2.display();
     }
 }
