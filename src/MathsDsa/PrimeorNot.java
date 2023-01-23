package MathsDsa;

public class PrimeorNot {
    public static void main(String[] args) {
        int n = 10;
        boolean[] prime = new boolean[n+1];
        primeCheck(n, prime);
    }                                                 // initially all array member are false
    static void primeCheck( int n,boolean[] prime){
        for (int i = 2 ; i*i <= n ; i++) {
            if (!prime[i]) {                           //!prime[i] = (prime[i] == false)
                for (int j = i*2; j < n ; j+= i) {
                    prime[j] = true;
                }
            }
        }
        for (int i = 2; i < n  ; i++) {
            if (!prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
