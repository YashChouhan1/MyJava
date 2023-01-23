package OOPs;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 20;
         int b = 0;
         try{
             System.out.println(divide(a,b));
         }
         catch (Exception obj ){
            System.out.println(obj.getMessage());
            //System.out.println(e.getCause());
         }
         finally {
             System.out.println("data saved!!");
         } // it will run in any possible condition.


    }
    static int divide(int x , int y) throws ArithmeticException{
        if (y == 0){
            throw new ArithmeticException("please enter the divisor other than 0!");
        }
        return x/y;
    }
}
