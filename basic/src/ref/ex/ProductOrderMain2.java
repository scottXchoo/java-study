package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[3];

        // createOrder()를 여러 번 사용해서 상품 주문 정보를 생성하고 배열에 저장
        orders[0] = createOrder("Apple", 1200, 5);
        orders[1] = createOrder("Grapes", 2000, 3);
        orders[2] = createOrder("Banana", 3200, 7);

        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(orders);

        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int totalAmount = getTotalAmount(orders);

        // 총 결제 금액 출력
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("order.productName = " + order.productName);
            System.out.println("order.quantity = " + order.quantity);
            System.out.println("order.price = " + order.price);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
