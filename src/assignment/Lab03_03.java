package assignment;

public class Lab03_03 {
    public static void main(String[] args) {
        int java = 3, mobile = 2, excel = 1;
        double A = 4.5, A0 = 4.0, B = 3.5;
        int sum = java + mobile + excel;
        double avg;

        avg = ((java * B) + (mobile * A0) + (excel * A)) / sum;
        avg = Math.round(avg * 100) / 100.0;
        System.out.println("평균 학점 : " + avg);
    }
}