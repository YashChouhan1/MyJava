package Practices;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InchesToFeet {
    public static void main(String[] args) {
        float num = 13.35f;
        float temp = num;

        float res = (float) (temp - (int)num);
        int count = 0 ;
        while(res > 0.12 ) {
            res -= 0.12;
            count += 1;
        }
        while(count > 0){
            num++;
            count--;
        }

        BigDecimal obj = new BigDecimal(res).setScale(2, RoundingMode.HALF_UP);
        float newRes = obj.floatValue();

        float ans = (int) num + newRes;
        System.out.println(ans+" feets");
        System.out.println((int) num + " Feet" + " " +(int) (newRes*100) + " Inches");
        //System.out.printf("%.2f" , res);
    }
}
