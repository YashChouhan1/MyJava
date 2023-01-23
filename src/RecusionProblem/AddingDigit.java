package RecusionProblem;

public class AddingDigit {
    public static void main(String[] args) {
       System.out.println(addDigit(12345));
    }

    private static int addDigit(int n) {
        if (n == 0) {
            return 0;
        }
        else {
            int rem = n % 10;
            n = n/10;
            return rem + addDigit(n);
        }
    }

}

