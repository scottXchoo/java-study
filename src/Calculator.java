import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        int plus, minus, mul, remain;
        double div;
        System.out.print("정수1: ");
        num1 = s.nextInt();
        System.out.print("정수2: ");
        num2 = s.nextInt();

        plus = num1 + num2;
        minus = num1 - num2;
        mul = num1 * num2;
        div = (double) num1 / num2;
        remain = num1 % num2;

        System.out.println(num1 + "+" + num2 + "=" + plus);
        System.out.println(num1 + "-" + num2 + "=" + minus);
        System.out.println(num1 + "*" + num2 + "=" + mul);
        System.out.println(num1 + "/" + num2 + "=" + div);
        System.out.println(num1 + "%" + num2 + "=" + remain);
    }
}