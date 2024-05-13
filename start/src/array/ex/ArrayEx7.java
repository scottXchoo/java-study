package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = 4;
        int col = 3;
        int[][] students = new int[row][col];
        int[] totalScores = new int[4];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < row; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < col; j++) {
                students[i][j] = s.nextInt();
                System.out.println(subjects[j] + " 점수: " + students[i][j]);
                totalScores[i] += students[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < row; i++) {
            double average = (double)totalScores[i] / col;
            System.out.println("총점: " + totalScores[i]);
            System.out.println("평균: " + average);
        }


    }
}
