// MusicPlayer 클래스를 활용하자.

package oop1;

/**
 * 객체 지향
 */

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        // 음악 플레이어 켜기
        player.on();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 증가
        player.volumeUp();

        // 볼륨 감소
        player.volumeDown();

        // 음악 플레이어 상태
        player.showStatus();

        // 음악 플레이어 끄기
        player.off();

    }
}
// MusicPlayer 객체를 생성하고, 필요한 기능(메서드)을 호출하기만 하면 된다.
