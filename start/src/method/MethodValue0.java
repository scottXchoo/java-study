package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1;
        // [대원칙] 값을 복사해서 대입한다!!!
        // num1의 기존 값은 유지되고 새로운 값이 num2에 들어가게 된다.
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
