import java.util.Scanner;

public class Delivery {
    public static void main(String[] args) {
        // 입력 : 받는 사람의 이름, 주소, 택배의 무게
        // 택배비 = 5 * 택배의 무게
        // 출력 : 택배비, 받는 사람의 이름, 주소
        Scanner s = new Scanner(System.in);
        String name, address;
        int weight;
        System.out.println("##택배 정보 입력##");
        System.out.print("받는 사람: ");
        name = s.nextLine();
        System.out.print("주소: ");
        address = s.nextLine();
        System.out.print("무게(g): ");
        weight = s.nextInt();

        System.out.println("택배비 => " + weight * 5 + "원");
        System.out.println("받는 사람 => " + name);
        System.out.println("주소 => " + address);
    }
}
