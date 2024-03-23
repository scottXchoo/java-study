package condition.ex;

public class GradeEx {
    public static void main(String[] args) {
        String grade = "Z";

        String comment = switch (grade) {
            case "A" -> "탁월한 성과!";
            case "B" -> "좋은 성과!";
            case "C" -> "준수한 성과!";
            case "D" -> "향상 필요!";
            case "F" -> "불합격!";
            default -> "잘못된 학점!";
        };
        System.out.println(comment);
    }
}
