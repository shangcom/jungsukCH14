package lambdaEx3;

public class Outer {
    int val = 10;

    class Inner {
        int val = 20; // 인스턴스 변수.

        void method(int i) {
            int val = 30; // final int val = 30;
//            i = 10; // 에러. 상수의 값을 변경할 수 없음.


            MyFunction f = () -> {
                System.out.println("i : " + i); // method(int i) 메서드의 매개변수 i 참조.
                System.out.println("val : " + val); // 메서드의 로컬 변수 val 참조.
                System.out.println("this.val : " + ++this.val); // Inner 클래스의 인스턴스 변수 val 참조하고 값을 증가시킴.
                System.out.println("Outer.this.val : " + ++Outer.this.val); // Outer 클래스의 인스턴스 변수 val 참조하고 값을 증가시킴.
            };
            f.myMethod();

        }
    }}
