package method;

public class Method1Ref {
    public static void main(String[] args) {
        // 계산1
        int sum1 = add(5, 12);
        System.out.println("sum1 = " + sum1);

        // 계산2
        int sum2 = add(12, 7);
        System.out.println("sum2 = " + sum2);

    }

    // add 메서드
    public static int add(int a, int b) { // 매개변수 목록
        System.out.println(a + " + " + b + " 연산 수행하자!");
        return a + b;
    }
    // public : 다른 클래스에서 호출할 수 있는 메서드라는 뜻
    // static : 객체를 생성하지 않고 호출할 수 있는 정적 메서드라는 뜻
    // int : 반환 타입을 정의한다.
    // 메서드 호출할 때, 메서드에 넘기는 값, 매개변수의 타입, 순서와 개수를 맞아야 한다.
    // 인수(Argument) : 넘기는 값
    // 매개변수(Parameter) : 메서드를 정의할 때, 선언한 변수
}