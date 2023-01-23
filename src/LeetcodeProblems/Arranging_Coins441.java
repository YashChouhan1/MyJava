package LeetcodeProblems;

public class Arranging_Coins441 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(func(num));
    }
    private static int func(int num) {

        if(num == 0){
                return 0;
            }

        int a = 0, ans = 0;
        while ( a < num){
            a++;
            ans++;
            num = num - a;
            }
          return ans;
        }
    }

