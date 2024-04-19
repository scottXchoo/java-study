package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        // while ((num = s.nextInt()) != -1)
        while (true) {
            int num = s.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }
        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
