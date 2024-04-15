package assignment;

public class HW2_3 {
    // 방정식 2x+4y=10의 모든 해를 구하시오.
    // 단, x와 y는 정수이고 각각의 범위는 0 ≤ x ≤ 10, 0 ≤ y ≤ 10 이다.
    public static void main(String[] args) {
        int x, y;
        for (int j = 0; j <= 10; j++) {
            y = j;
            x = 5 - 2 * y;
            if (x >= 0) {
                System.out.println("x: " + x + ", y: " + y);
            }
        }
    }
}
