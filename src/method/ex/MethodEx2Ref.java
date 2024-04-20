package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        String msg = "Hello, world!";
        printMsg(msg, 3);
        printMsg(msg, 5);
        printMsg(msg, 7);
    }

    public static void printMsg(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}
