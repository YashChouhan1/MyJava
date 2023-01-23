package RecusionProblem;

public class powerofTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0 || n == 1) {
            return  false;
        }
        else if (( n & (n - 1)) == 0) {
            return  true;
        }
        else return false;
    }
}

