package MathsDsa;

public class RomanToInt {
    public static void main(String[] args) {
       String str = "CLXXVI";
       System.out.println(romanToInt(str));
    }
    static int romanToInt(String str) {
        int n = str.length();
        int  result = 0 , i = 0;
        int current , next;
        while(i<n){
            if (i == n - 1) {
                result += getInteger(str.charAt(i));
                return result;
            }
            current = getInteger(str.charAt(i));
            next = getInteger(str.charAt(i + 1));
            if (current >= next) {
                result += current;
            }
            else{
                result += next - current;
                i+=2;
            }
        }
        return result;
    }

    private static int getInteger(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}