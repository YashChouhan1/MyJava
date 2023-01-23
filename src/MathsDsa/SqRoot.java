package MathsDsa;

public class SqRoot {
    public static void main(String[] args) {
        int n = 190;
        int p = 3;
        System.out.printf("%.3f" , sqRt(n , p));
    }
    static double sqRt(int n, int p) {
        int s = 0;
        int e = n;
        double root = 0;
        int mid = (s + e) / 2;
        if (mid*mid == n) {
            return root = mid;
        }
        if (mid*mid > n) {
            e = mid - 1;
        }
        else{
            s = mid + 1;
        }
        float incr = (float) 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n ){
                root = root + incr;
            }
            root = root - incr;
            incr = incr/10;
        }
        return root;
    }
}

