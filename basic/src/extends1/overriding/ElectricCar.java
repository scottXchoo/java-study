package extends1.overriding;

public class ElectricCar extends Car {
    @Override // 휴먼 에러를 막아줌
    public void move() {
        System.out.println("전기차 이동");
    }

    public void charge() {
        System.out.println("차 충전");
    }
}
