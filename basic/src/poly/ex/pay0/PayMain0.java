package poly.ex.pay0;

public class PayMain0 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // 카카오 결제
        String payOpt1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOpt1, amount1);

        // 네이버 결제
        String payOpt2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOpt2, amount2);

        // 결제 실패
        String payOpt3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOpt3, amount3);
    }
}
