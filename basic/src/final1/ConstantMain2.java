package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + Constant.MAX_USERS);
        int currentUserCnt = 999;
        process(currentUserCnt++);
        process(currentUserCnt++);
        process(currentUserCnt++);
    }

    private static void process(int currentUserCnt) {
        System.out.println("참여자 수: " + currentUserCnt);
        if (currentUserCnt > Constant.MAX_USERS) {
            System.out.println("대기자 등록");
        } else {
            System.out.println("게임 참여");
        }
    }
}
