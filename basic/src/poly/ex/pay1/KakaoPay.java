package poly.ex.pay1;

public class KakaoPay implements Payments{
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
    }
}
