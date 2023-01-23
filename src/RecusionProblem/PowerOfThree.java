package RecusionProblem;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(power(1162261467));
    }

    private static boolean power(double n) {
        if (n == 0){
            return false;
        }
        if ( n == 1.0){
            return true;
        }
        else return power(n/3);
    }
}
