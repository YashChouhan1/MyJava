package RecusionProblem;

public class stepToReduse2 {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(45));
    }
     static int count;
    public static int numberOfSteps(int n) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            count+= 1;
            return numberOfSteps(n / 2);
        }
        if (n % 2 == 1) {
            count+= 1;
            return numberOfSteps(n - 1);
        }

        return count;
    }
}
