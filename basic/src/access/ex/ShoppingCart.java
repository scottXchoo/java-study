package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount = 0;

    void addItem(Item item) {
        if (itemCount >= items.length) {
            System.out.println("장바구니 가득 참");
            return;
        }
        items[itemCount++] = item;
    }

    void displayItems() {
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotal());
        }
        System.out.println("전체 금액: " + calcTotalPrice());
    }

    private int calcTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotal();
        }
        return totalPrice;
    }
}
