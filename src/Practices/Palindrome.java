package Practices;

public class Palindrome {
    public static void main(String[] args) {
        String str = "abcdpcba";
        paliDr(str);
    }
    static void paliDr(String str)  {
        int num = str.length();
        int[] arr = {1,2,3};
        int n= arr.length;
        int i;
        for (i = 0;i < num/2; i++) {
            if (str.charAt(i) == str.charAt(num - 1)) {
                num--;
            } else {
                System.out.println("false");
            }
            System.out.println("true");
        }
    }
}
