package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int[] students = {90, 85, 70}; // 배열 생성과 초기화

        // 변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + students[i]);
        }
    }
}
