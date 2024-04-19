package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            String name = s.next();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int age = s.nextInt();

            System.out.println("name = " + name);
            System.out.println("age = " + age);
        }
    }
}
