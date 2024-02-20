package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        // 객체를 생성하는 동시에 생성자 호출
        // new 생성자이름(생성자에 맞는 인수 목록)
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }
    }
}

/*
생성자의 장점
- 중복 호출 제거
- 제약 : 생성자 호출 필수 (유령회원 방지)
- 생성자를 사용하면 필수값 입력을 보장할 수 있다.
 */