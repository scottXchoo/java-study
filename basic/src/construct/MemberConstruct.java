package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가
    MemberConstruct(String name, int age) {
        this(name, age, 777);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
