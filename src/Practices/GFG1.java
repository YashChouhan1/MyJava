package Practices;

public class GFG1 {
    public static void main(String[] args) {
        String str = "aaabbccddd";

        System.out.println(removePair2(str));
    }

    public static StringBuilder removePair(String s) {

        StringBuilder sb = new StringBuilder(s);

        int i = 0;

        while (i < sb.length() - 1){
            if (sb.charAt(i) == sb.charAt(i+1)){
                sb.deleteCharAt(i+1);
            }
            i++;
        }
        return sb;
    }

    public static String removePair2(String s) {

        int i = 0;

        while (i < s.length() - 1){
            if (s.charAt(i) == s.charAt(i+1)){
                s.replace(s.charAt(i) , '0');
                s.replace(s.charAt(i+1), '0');
            }
            i++;
        }
        return s;
    }
}
