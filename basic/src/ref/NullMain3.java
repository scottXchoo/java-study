package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException : 참조형은 null로 초기화
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
