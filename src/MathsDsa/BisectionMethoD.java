package MathsDsa;

public class BisectionMethoD {
    public static void main(String[] args) {
        // System.out.println(eqSol(0));
        double min = 0;
        double max = 0;

        for (int i = 0; i < 20; i++) {
            if (eqSol(i) < 0){
                min = i;
            }
            if (eqSol(i) > 0){
                max = i;
                break;
            }
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
        System.out.println("---------------------");

        double root;
        root = (float) comPare(max , min);
        System.out.printf("SqRoot 0f the n^3 - 3*n - 5 is " + "%.03f" ,root);
    }
    private static double comPare(double max, double min) {
        int i = 0;
        double ans;
        double mid = 0;
        while (i<5){
            mid = (max + min)/ 2;
            ans = eqSol(mid);
            if (ans > 0) {
                max = mid;
            }
            else {
                min = mid;
            }
            i++;
        }
        return mid;
    }
    static double eqSol(double n){
        double result;
        result =  (Math.pow(n, 3) - (3 * n) - 5);
        return result;
    }
}

