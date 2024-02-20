// 코드에서 첫 줄에는 package를 사용하고 ,다음 줄에는 import를 사용할 수 있다.

package pack;

// import를 사용하여, 다른 패키지에 있는 클래스를 가져와 사용한다.
// import를 사용한 덕분에, 코드에서는 패키지명을 생략하고 클래스 이름만 적을 수 있다.
// *를 통해, 해당 패키지에 있는 모든 클래스를 가져올 수 있다.
import pack.a.*;

public class PackageMain2 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // import 사용으로 패키지 명 생략 가능
    }
}
