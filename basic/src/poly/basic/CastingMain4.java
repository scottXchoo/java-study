package poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // parent1에는 Child 인스턴스가 있음
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent(); // parent1에는 Child 인스턴스가 없음
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가
    }
}