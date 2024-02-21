package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp(); // 음량을 100 이상으로 높이려 시도.
        speaker.showVolume(); // 음량이 높아지지 않고 그대로 100 유지

        // 필드에 직접 접근하면, volumeUp()과 같은 메서드로 음량이 100을 넘지 못하도록 개발한 것은 소용이 없다.
        System.out.println("volume 필드 직접 접근 수정");
        //speaker.volume = 200; // private 접근 오류
        speaker.showVolume();
    }
}
// volume 필드의 외부 접근을 막을 수 있는 방법에 대해 알아보자. (volume을 private으로)
