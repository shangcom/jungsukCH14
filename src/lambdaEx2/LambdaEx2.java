package lambdaEx2;

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {};
//        Object obj = () -> {};
// 함수형 인터페이스 아닌 변수에 람다식 직접 할당 불가능.
// 형변환 해줘야 컴파일러가 람다식의 타입(람다식이 어떤 인터페이스의 메서드를 구현한 것인지) 추론 가능
        Object obj =(MyFunction) () -> {};

        String str = ((MyFunction)(() -> {})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println(()->{});
        System.out.println((MyFunction)(()->{}));
//        System.out.println((MyFunction)(()->{}).toString()); // 에러.
/*
MyFunction 인터페이스에는 toString() 메서드가 없으므로 사용 불가능함.
* 일반 인터페이스와 일반 구현 클래스였다면 Object 클래스의 메서드를 바로 사용할 수 있음.
* 그러나 Functional 인터페이스와 그를 구현한 함수형 인터페이스 타입의 람다식은 불가능함.
* 컴파일러는 함수형 인터페이스의 경우, 해당 인터페이스에 정의된 메서드만을 사용할 수 있게 제한함.
* 따라서 Object 클래스의 메서드를 사용하기 위해서는 아래와 같이 명시적으로 Object 타입으로 다시 형변환해야함.
*/
        System.out.println(((Object)(MyFunction)(()->{})).toString());
    }
}
