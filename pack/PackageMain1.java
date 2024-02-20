package pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data(); // 같은 패키지에 있다면 그냥 클래스 이름을 불러다 쓰면 된다.

        // 허나 pack.a 안에 있는 User를 호출하려면 이렇게 하면 된다.
        // 즉, 다른 패키지라면 패키지명.클래스명으로 적어주면 된다.
        pack.a.User user = new pack.a.User();

    }
}
