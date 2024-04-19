package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = s.nextInt();
        int[] arr = new int[count];

        int max = 0;
        int min = 10000;
        for (int i = 0; i < count; i++) {
            arr[i] = s.nextInt();
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("가장 큰 정수: " + max);
        System.out.println("가장 작은 정수: " + min);
    }
}
