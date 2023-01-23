package RecusionProblem;

public class reverseTheNumber
{
    public static void main(String[] args) {
        rev(12345);
    }
    private static int rev(int n) {
        if (n==0){
            return 0;
        }
        int rem = n%10;
        System.out.print(rem);
        n = n/10;
        return rev(n);
    }

}
