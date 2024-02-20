// User이 패키지 a에도 있고, b가 있을 경우,
// 둘 중 하나의 User는 다 적어 주어야 한다.
// 이런 경우에 자주 사용하는 클래스를 import 해주는 경우가 많다.

package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
