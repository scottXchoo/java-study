package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[5];
        // 배열이 생성되면, 배열의 참조값(메모리 주소)가 나오는데
        // 이를 students 라는 변수에 저장한다!!!

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 변수 값 사용
        System.out.println("std1 = " + students[0]);
        System.out.println("std2 = " + students[1]);
        System.out.println("std3 = " + students[2]);
        System.out.println("std4 = " + students[3]);
        System.out.println("std5 = " + students[4]);
    }
}
