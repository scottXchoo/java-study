package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; // private
        speaker.showVolume();
    }
}

// private : 모든 외부 호출을 막는다.
// default(package-private) : 같은 패키지 안에서 호출은 허용한다.
// protected : 같은 패키지 안에서 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
// public : 모든 외부 호출을 허용한다.
// 접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것
//