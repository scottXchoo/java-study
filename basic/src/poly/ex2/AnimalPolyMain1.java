package poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

       soundAnimal(dog);
       soundAnimal(cat);
       soundAnimal(cow);
    }

    // 다형성 참조 : 부모는 자식을 품는다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound(); // 메서드 오버라이딩 : 각 인스턴스의 메서드 호출 가능
        System.out.println("동물 소리 테스트 종료");
    }
}
