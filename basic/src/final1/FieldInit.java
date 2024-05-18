package final1;

public class FieldInit {
    static final int CONST_VALUE = 20;
    final int value = 20;

    public FieldInit() {
        // this.value = value; // 컴파일 오류
    }
}
