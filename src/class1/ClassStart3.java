package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // 변수 선언
        student1 = new Student(); // 객체 또는 인스턴스 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2;
        student2 = new Student(); // new는 참조값을 리턴 => student2 = 0x123
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student student3;
        student3 = new Student(); // 메모리에 담기
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 75;

        System.out.println(student3); // class1.Student@30f39991

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);
        System.out.println("이름: " + student3.name + " 나이: " + student3.age + " 성적: " + student3.grade);
    }
}
