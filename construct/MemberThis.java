package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; // 필드 이름과 매개변수의 이름이 다르므로, this 생략
        // 맴버 변수에 접근할 때, 무조건 this를 적는 코딩 스타일도 존재한다. (지역변수, 맴버변수 구분 위해)
        // but, IDE의 발전으로 색깔로 구분 가능해, 필요가 없어졌다.
    }
}
