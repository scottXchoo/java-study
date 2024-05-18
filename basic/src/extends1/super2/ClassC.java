package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10); // ClassB에는 기본 생성자 X
        System.out.println("ClassC 생성자");
    }
}
