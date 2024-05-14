package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);

        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어 시작");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("플레이어 종료");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨 Up: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨 Down: " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }
}