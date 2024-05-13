package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 입력 : 상품명, 가격, 수량, 옵션
        // 출력 : 총 가격
        // 결제 옵션 => 총 비용 출력 & 총 비용 = 0으로 초기화
        // 종료 옵션 => 프로그램을 종료합니다.
        // 다른 옵션 => 올바른 옵션을 선택해주세요.
        int totalCost = 0;
        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.print("상품을 입력하세요: ");
                    String name = s.next();
                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = s.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    int count = s.nextInt();
                    System.out.println("상품명: " + name + ", 가격: " + price + ", 수량: " + count);
                    totalCost += price * count;
                    break;
                case 2:
                    System.out.println("총 비용은 " + totalCost + "입니다.");
                    totalCost = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
                    break;
            }
            if (option == 3) break;
        }
    }
}
