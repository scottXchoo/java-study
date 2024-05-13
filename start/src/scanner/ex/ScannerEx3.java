package scanner.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String foodName = input.next();
        double foodPrice = input.nextDouble();
        int foodQuantity = input.nextInt();

        double totalPrice = foodPrice * (double) foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다.");
        System.out.println("총 가격은 " + totalPrice + "원입니다.");
    }
}
