package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println("출력");
        for (int i = nums.length - 1; 0 < i; i--) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print(nums[0]);
    }
}
