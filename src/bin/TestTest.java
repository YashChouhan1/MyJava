package bin;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
     int x = 10;
     int sum( int num1 , int num2 ){
         return num1 + num2;
     }

    public static void main(String[] args) {
        TestTest obj = new TestTest();
        TestTest obj2 = new TestTest();
        obj.sum(1,2);

    }
}
