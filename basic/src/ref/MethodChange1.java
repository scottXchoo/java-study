package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전: a = " + a);
        changePrimitive(a); // 매개변수 x에 변수 a의 값 전달
        // 메서드가 종료되면 매개변수 x는 제거된다.
        System.out.println("메서드 호출 후: a = " + a);
    }

    public static void changePrimitive(int x) {
        x += 10;
    }
}
