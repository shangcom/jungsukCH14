package lamdaEx1;



public class LamdaEx1 {
    static void execute(MyFunction function) {
        function.run(); //매개변수 타입이 Myfunction인 메서드
    }

    static MyFunction getMyFunction() {
        MyFunction function = () -> System.out.println("f3.run()");
        return function;
    }

    public static void main(String[] args) {
        //람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() {
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
