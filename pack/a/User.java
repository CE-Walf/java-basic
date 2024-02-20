package pack.a; // .을 통해 하위에 있다고 알려줌

public class User {
    // 추가 : 다른 패키지에서, 이 클래스의 생성자를 호출하려면 public을 사용해야 한다.
    public User() {
        System.out.println("패키지 pack.a 회원 생성");
    }
}
