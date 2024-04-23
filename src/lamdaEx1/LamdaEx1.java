package lamdaEx1;



public class LamdaEx1 {
    static void execute(MyFunction function) {
        function.run(); //매개변수 타입이 Myfunction인 메서드
    }

    static MyFunction getMyFunction() { // 반환타입이 타입이 MyFunction인 메서드
        MyFunction function = () -> System.out.println("f3.run()");
        // 뒤의 람다식은, 사실 아래와 같음. 즉, MyFunction 익명 객체를 만들어 집어 넣는 것을 식으로 표현한 것임.
//        new MyFunction() {
//            @Override
//            public void run() {
//                System.out.println("f3.run()");
//            }
//        };
        return function;
    }

    public static void main(String[] args) {
        //람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { // 익명클래스로 run() 구현
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("run"));
    }
}
