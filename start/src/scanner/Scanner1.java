package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String str = s.nextLine();
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = s.nextInt();
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요: ");
        double doubleValue = s.nextDouble();
        System.out.println("입력한 실수: " + doubleValue);
    }
}
