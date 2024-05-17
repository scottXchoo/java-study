package static2;

//import static static2.DecoData.staticCall;
//import static static2.DecoData.*;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData.staticCall(data1);
        DecoData.staticCall(data1);
        DecoData.staticCall(data1);

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        DecoData.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}

// main 메서드는 정적 메서드
// 인스턴스 생성 없이 실행하는 가장 대표적인 메서드가 바로 main() 메서드
// 프로그램을 시작하는 시작점이 되는데, 생각해보면 객체를 생성하지 않아도 main() 메서드가 작동했따. 이것은 main() 메서드가 static이기 때문이다.
// main 메서드가 같은 클래스에서 호출하는 메서드도 정적 메서드로 선언해서 사용한다.