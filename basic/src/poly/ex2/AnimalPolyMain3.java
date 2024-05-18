package poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        // 다형적 참조 덕분에 배열에 포함 가능
        Animal[] animalArr = {new Dog(), new Cat(), new Cow(), new Duck()};
        
        for (Animal animal : animalArr) {
            extracted(animal);
        }
    }

    private static void extracted(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 시작");
    }
}
