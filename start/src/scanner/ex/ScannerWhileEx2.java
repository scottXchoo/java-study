package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            double price = s.nextDouble();
            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int quantity = s.nextInt();

            double totalPrice = price * (double) quantity;
            System.out.println("totalPrice = " + totalPrice);
            
        }

        
    }
}
