package poly.ex.pay1;

public class TossPay implements Payments {
    @Override
    public void pay(int amount) {
        System.out.println("토스페이 시스템과 연결합니다.");
    }
}
