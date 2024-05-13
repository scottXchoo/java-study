package casting;

public class Casting1 {
    public static void main(String[] args) {
        // 작은 범위 숫자 타입에서 큰 범위 숫자 타입에 대입을 하면 문제 X
        /// 자동 형변환 or 묵시적 형변환
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        doubleValue = intValue;
        System.out.println("doubleValue1 = " + doubleValue);

        doubleValue = 20L;
        System.out.println("doubleValue2 = " + doubleValue);
    }
}
