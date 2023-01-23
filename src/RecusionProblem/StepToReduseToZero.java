package RecusionProblem;

public class StepToReduseToZero {
    public static void main(String[] args) {
    System.out.println(reduSe(45,0));
    }
    private static int reduSe(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            return reduSe(n / 2, count+= 1);
        }
        if (n % 2 == 1) {
            return reduSe(n - 1, count+= 1);
        }

        return count;
    }
}

