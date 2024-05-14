package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        data.volume = 0;
        data.isOn = false;

        data.isOn = true;
        System.out.println("음악 플레이어 시작");

        data.volume++;
        System.out.println("볼륨: " + data.volume);

        data.volume++;
        System.out.println("볼륨: " + data.volume);

        data.volume--;
        System.out.println("볼륨: " + data.volume);

        if (data.isOn) {
            System.out.println("플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("플레이어 OFF");
        }

        data.isOn = false;
        System.out.println("플레이어 종료");
    }
}
