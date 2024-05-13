package assignment;

public class HW2_2 {
    // Math.random()을 이용해서 1부터 6사이의 임의의 정수를
    // 변수 value에 저장하는 코드를 완성하라.
    public static void main(String[] args) {
        // (int) Math.random() * (최댓값-최소값+1) + 최소값
        double value = Math.random() * (6 - 1 + 1) + 1;
        int intValue = (int) value;
        System.out.println(intValue);
    }
}
