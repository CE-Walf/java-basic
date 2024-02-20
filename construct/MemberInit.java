package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade){
        // this는 인스턴스 자신의 참조값을 가리킨다. (인스턴스의 맴버 변수에 접근)
        // 매개변수의 이름과 맴버 변수의 이름이 같은 경우 this를 사용해서 둘을 명확하게 구분해야 한다.
        // 필드의 이름과 매개변수의 이름이 서로 다르다면, this 생략 가능하다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
