// height ke according new array me store karne h people array ke values descending wise.

package LeetcodeProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortThePeople {
    public static void main(String[] args) {
        String[] people = {"sanskar", "yash", "sana", "om", "kushal", "priya"};
        int[] height = {170, 175, 155, 195, 180, 165};
        String[] newArr = new String[people.length];
        int max = 0;
        int a = 0;
        int index = 0;

        for (int j = 0; j < newArr.length; j++) {                      //1

            for (int i = 0; i < height.length - 1; i++) {                     //2
                if ((height[i] > height[i + 1]) & (height[i] > max)) {        //3
                    max = height[i];
                }
                if ((height[i] < height[i + 1]) & (height[i + 1] > max)) {
                    max = height[i + 1];
                }
            }
            for (int k = 0; k < height.length; k++) {                       //5
                if (max == height[k]) {
                    index = k;
                }
            }
            height[index] = -1;                                               //6
            max = -1;

            newArr[a] = people[index];                                         //7
            a++;
        }
        System.out.println(Arrays.toString(newArr));
    }
}

/* 1. sabse pahle newArr tak ka ek loop laga diya taki yeh sirf vahi tak value store kare.
   2. phir main loop ke andar ek or for loop lagaya jo ki height.lenght tak chalenga or uske andar ki
      max value ko find karenga.
   3. inside 2nd loop theory -
      - if ke andar condition yaha kahti h ki agr ith index , i+1)th index se bada h tho or ith index ,
      max value se bhi bada h tho tabhi yeh us particular index ki value ko max count karenga .
      - dusri if condition me bhi yahi ho rha h.
   4. is puri process ke baad hme max value mil jayngi height array me se.
   5. agle wale for loop me height array ki jo bhi value , max value ke equal aayngi usko yaha , uske
      index ko "index" varible ke andar store kar lenge.
   6. iske baad height ke voh particular index ki value 0r max ki value ko -1 kr denge taki agle jab
       1st loop fir se start ho tho koi dikkat na aaye.
   7. line 32 me , height array ki correspondging value jo ki people array me thi for ex. sanskar -> 170,
       yeh value newArr ke 0th(a'th) position me store ho jayngi. phir a ka counter badh jaynga.
   8.  phir vahi vapas repeat honga agle loops me.
 */
