package oop1;

// 객체 지향 프로그래밍 - 뮤직 플레이어
public class MusicPlayer {
    // 속성과 기능이 캡슐화

    // 속성
    int volume = 0;
    boolean isOn = false;

    // 기능
    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
    }
    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨 : " +  volume);
    }

    void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
