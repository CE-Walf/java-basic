// 접근 제어자는 클래스 ,필드, 생성자, 메서드에서 사용 가능하다.
package access;

public class Speaker {

    // private : 해당 클래스 내부에서만 호출할 수 있다.
    private int volume; // 외부 접근 못하게 private

    // 생성자로 초기 음량 지정하기
    Speaker(int volume) {
        this.volume = volume;
    }

    // 볼륨 높이기
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    // 볼륨 줄이기
    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    // 현재 음량 출력
    void showVolume() {
        System.out.println("현재 음량 : " + volume);
    }
}
