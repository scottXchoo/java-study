package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
        int max = 100;
        int i = 1;
        int sum = 0;
        while (max > 0) {
            sum += i;
            i++;
            max--;
        }
        System.out.println(sum);
    }
}
