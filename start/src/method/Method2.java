package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("= 프로그램 진행 =");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램 시작 =");
        // void : return을 유일하게 생략할 수 있다.
    }

    public static void printFooter() {
        System.out.println("= 프로그램 종료 =");
    }
}
