package OOPs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

        list.forEach((item) -> System.out.println(item*8));
        // this is called lambda expression

        Consumer<Integer> fun = (item) -> {
            System.out.println(item * 9);
        };

    }
}
