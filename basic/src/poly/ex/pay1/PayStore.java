package poly.ex.pay1;

public class PayStore {
    public static Payments findPayments(String option) {
        Payments payments = null;
        switch (option) {
            case "kakao" -> {
                payments = new KakaoPay();
            }
            case "naver" -> {
                payments = new NaverPay();
            }
            case "toss" -> {
                payments = new TossPay();
            }
        }
        return payments;
    }
}
