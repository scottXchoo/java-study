package static2.ex;

public class Car {
    private String name;
    private static int carCnt;

    public Car(String name) {
        System.out.println(name + " 차량 구입");
        this.name = name;
        carCnt++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + carCnt);
    }
}
