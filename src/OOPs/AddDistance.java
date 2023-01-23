package OOPs;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AddDistance {
    public static void main(String[] args) {

      AddDistance obj = new AddDistance();
      float a = 21.7f;
      float b = 36.8f;
      System.out.println(obj.add(a,b));
    }
        private float add(float a, float b) {
            float num = (int)a + (int)b;
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
            return ans;
    }
}
