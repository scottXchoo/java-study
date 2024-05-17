package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        // 인스턴스 생성을 막는다.
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static double average(int[] array) {
        int len = array.length;
        int sum = sum(array);
        return (double) sum / len;
    }

    public static int min(int[] array) {
        int minValue = array[0];
        for (int i : array) {
            if (minValue > i) {
                minValue = i;
            }
        }
        return minValue;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int i : array) {
            if (maxValue < i) {
                maxValue = i;
            }
        }
        return maxValue;
    }
}
