package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 > num2) {
            int temp = num2;
            num2 = num1;
            num1 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = num1; i < num2; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(num2);
    }
}
