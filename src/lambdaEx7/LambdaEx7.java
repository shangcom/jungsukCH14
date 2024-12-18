package lambdaEx7;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx7 {
    public static void main(String[] args) {

        Function<String, Integer> f = s -> Integer.parseInt(s, 16); //
        Function<Integer, String> g = i -> Integer.toBinaryString(i); // 정수 i를 2진수 문자열로 반환
//        Function<Integer, String> g = Integer::toBinaryString; // 메서드 참조로 간단하게 표현

        Function<String, String> h = f.andThen(g);
        Function<Integer, Integer> h2 = f.compose(g);

        System.out.println(h.apply("FF")); // "FF" -> 255 -> "11111111"
        System.out.println(h2.apply(2)); // 2 -> "10" -> 16

        Function<String, String> f2 = x -> x; // 항등함수(identity function)
        Function<String, String> f3 = Function.identity(); // f2와 같음.

        System.out.println(f2.apply("AAA"));
        System.out.println(f3.apply("AAA"));

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i % 2 == 0;
        Predicate<Integer> notP = p.negate(); // i >= 100

        Predicate<Integer> all = notP.and(q.or(r));
        System.out.println(all.test(150));

        String str1 = "abc";
        String str2 = "abc";

        Predicate<String> p2 = Predicate.isEqual(str1);
        boolean result = p2.test(str2);
        System.out.println(result);
    }
}
