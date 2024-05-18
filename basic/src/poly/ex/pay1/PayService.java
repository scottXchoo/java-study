package poly.ex.pay1;

public class PayService {
    void processPay(String option, int amount) {
        Payments payments = PayStore.findPayments(option);
        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        boolean result = false;
        if (payments != null) {
            payments.pay(amount);
            result = true;
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제 수단이 없습니다.");
            System.out.println("결제가 실패했습니다.");
        }
    }


}
