package lambdaEx4;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaEx4 {
    public static void main(String[] args) {

        System.out.println("Consumer<Integer> 인터페이스 : 매개변수 하나, 반환값 없음");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        System.out.println("익명 클래스를 사용한 경우");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + ",");
            }
        });


        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);
    }
}
