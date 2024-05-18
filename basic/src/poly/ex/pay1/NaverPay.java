package poly.ex.pay1;

public class NaverPay implements Payments{
    @Override
    public void pay(int amount) {
        System.out.println("네이버 시스템과 연결합니다.");
    }
}
