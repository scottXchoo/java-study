package method;

public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        // int에서 double은 가능하다. double이 더 큰 그릇이기 때문.
        printNumber(number);

    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
