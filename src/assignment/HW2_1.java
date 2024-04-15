package assignment;

public class HW2_1 {
    // Q1. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수 출력
    public static void main(String[] args) {
        int x;
        for (int i = 1; i < 6; i++) {
            x = i;
            int y = 6 - x;
            System.out.println("x: " + x + ", y: " + y);
        }
    }
}
