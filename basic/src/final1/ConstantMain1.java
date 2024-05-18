package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int currentUserCnt = 999;
        process(currentUserCnt++);
        process(currentUserCnt++);
        process(currentUserCnt++);
    }

    private static void process(int currentUserCnt) {
        System.out.println("참여자 수: " + currentUserCnt);
        if (currentUserCnt > 1000) {
            System.out.println("대기자 등록");
        } else {
            System.out.println("게임 참여");
        }
    }
}
