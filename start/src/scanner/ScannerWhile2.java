package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int num1 = s.nextInt();
            int num2 = s.nextInt();

            if (num1 == 0 && num2 == 0) {
                break;
            } else {
                System.out.println("num1 = " + num1);
                System.out.println("num2 = " + num2);
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
