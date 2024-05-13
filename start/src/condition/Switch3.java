package condition;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 4;

        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 5000;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
