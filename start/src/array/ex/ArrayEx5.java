package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];

        int sum = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        double average = (double)sum / num;
        System.out.println("합계: " + sum);
        System.out.println("평균: " + average);
    }
}
