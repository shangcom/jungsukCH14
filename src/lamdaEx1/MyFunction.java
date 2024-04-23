package lamdaEx1;

@FunctionalInterface // 함수형 인터페이스임을 명시적 선언.
interface MyFunction {
    abstract void run();
//    abstract void walk();  오직 하나의 추상 메서드만 가질 수 있음.
}