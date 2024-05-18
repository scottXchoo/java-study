package poly.ex.pay1;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();

        // Kakao 결제
        payService.processPay("kakao", 10000);

        // Naver 결제
        payService.processPay("naver", 12000);

        // 결제 실패
        payService.processPay("bedal", 20000);

        // Toss 결제
        payService.processPay("toss", 50000);
    }
}
