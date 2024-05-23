package lambdaEx2;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class Ex1 {
    public static void main(String[] args) {
        MyFunctionalInterface func = () -> System.out.println("Hello, Lambda!");

        // 람다식의 toString() 호출
        System.out.println(func.toString());
    }
}