package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        System.out.print("입력할 주문의 개수: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] orders = new ProductOrder[n];

        // createOrder()를 여러 번 사용해서 상품 주문 정보를 생성하고 배열에 저장
        for (int i = 0; i < n; i++) {
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");

            System.out.print("상품명: ");
            String productName = s.nextLine();

            System.out.print("가격: ");
            int price = s.nextInt();

            System.out.print("수량: ");
            int quantity = s.nextInt();
            s.nextLine(); // 입력 버퍼를 비우기 위한 코드

            orders[i] = createOrder(productName, price, quantity);
        }

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
            System.out.println("productName: " + order.productName);
            System.out.println("quantity: " + order.quantity);
            System.out.println("price: " + order.price);
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
