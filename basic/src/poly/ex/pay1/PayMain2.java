package poly.ex.pay1;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.println("결제 수단을 입력하세요: ");
            String option = s.nextLine();

            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액을 입력하세요: ");
            int amount = s.nextInt();
            s.nextLine();
            payService.processPay(option, amount);
        }
    }
}