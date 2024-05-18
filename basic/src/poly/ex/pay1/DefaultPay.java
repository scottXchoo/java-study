package poly.ex.pay1;

public class DefaultPay implements Payments{
    @Override
    public void pay(int amount) {
        System.out.println("결제 수단이 없습니다.");
        System.out.println("결제가 실패했습니다.");
    }
}
