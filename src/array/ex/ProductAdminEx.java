package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        // 등록 : 상품 이름과 가격을 입력받아 저장
        // 목록 : 지금까지 등록한 모든 상품의 목록 출력
        // 옵션 선택
        // 1 - 사용자로부터 상품 이름과 가격 입력받아 배열에 저장
        // 2 - 배열에 저장된 모든 상품 출력
        // 3 - 프로그램 종료
        Scanner s = new Scanner(System.in);
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int index = 0;
        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("옵션을 선택하세요: ");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    if (index >= maxProducts) {
                        System.out.println("더 이상 상품 등록 X");
                        continue;
                    }
                    System.out.println("이름과 가격을 입력하시오: ");
                    productNames[index] = s.next();
                    productPrices[index] = s.nextInt();
                    index++;
                    break;
                case 2:
                    for (int i = 0; i < index; i++) {
                        System.out.println("상품 이름: " + productNames[i]);
                        System.out.println("상품 가격: " + productPrices[i]);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("다른 옵션을 선택하세요.");
                    break;
            }
            if (option == 3) break;
        }


    }
}
