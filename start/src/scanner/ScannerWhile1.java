package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String input = "";
        while (!input.equals("exit")) {
            input = s.next();
            System.out.println("input = " + input);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
