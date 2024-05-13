package class1.ex;

public class ProductOrderMain1 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[2];

        ProductOrder tofu = new ProductOrder();
        tofu.price = 2000;
        tofu.productName = "두부";
        tofu.quantity = 3;
        orders[0] = tofu;

        ProductOrder cola = new ProductOrder( );
        cola.price = 1500;
        cola.productName = "콜라";
        cola.quantity = 5;
        orders[1] = cola;

        int total = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            total += order.price * order.quantity;
        }
        System.out.println("총 결제 금액: " + total);

    }
}
