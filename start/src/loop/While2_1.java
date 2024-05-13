package loop;

public class While2_1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        sum += i;
        System.out.println("i = " + i + "sum = " + sum);
        i++;

        sum += i;
        System.out.println("i = " + i + "sum = " + sum);
        i++;

        sum += i;
        System.out.println("i = " + i + "sum = " + sum);
        // 좋은 코드인지 아닌지는 변경사항이 발생했을 때, 알 수 있다.
    }
}
