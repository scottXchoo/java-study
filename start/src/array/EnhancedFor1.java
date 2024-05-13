package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        // 일반 for문
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

        // 향상된 for문 : for-each문
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
