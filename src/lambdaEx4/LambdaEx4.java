package lambdaEx4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaEx4 {
    public static void main(String[] args) {

//      Consumer<Integer> 인터페이스 : 매개변수 하나, 반환값 없음
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }


        list.forEach(i -> System.out.print(i + ","));
        System.out.println();

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer + ",");
            }
        });
        System.out.println();


        // Predicate<Integer> 인터페이스 : 조건식 표현. 매개변수 하나, 반환타입 boolean
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

//        list.removeIf(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 5 == 0 || integer % 7 == 0;
//            }
//        });
//        System.out.println(list);

        // UnaryOperator<T> 인터페이스 : Function의 자손. 매개변수와 반환값 타입 같음.
        list.replaceAll(i -> i*10);
        System.out.println(list);

//        list.replaceAll(new UnaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * 10;
//            }
//        });
//        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((s, s2) -> System.out.print("{" + s + ", " + s2 + "},"));
        System.out.println();
//        map.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String s, String s2) {
//                System.out.print("{" + s + ", " + s2 + "},");
//            }
//        });
    }
}
