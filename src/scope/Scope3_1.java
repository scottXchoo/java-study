package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // temp는 if문 안에서만 사용하는데, 밖에 선언
        /// 문제 : 1) 불필요한 메모리 낭비, 2) 코드 복잡성 증가
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
