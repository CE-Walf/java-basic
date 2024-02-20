/*
MethodInitMain1의 단점은, 코드에서 회원의 초기값을 설정하는 부분이 반복된다는 것이다.
메서드를 사용해서 반복을 제거해 보자.
 */

package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "user1", 15, 90);

        MemberInit member2 = new MemberInit();
        initMember(member2, "user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);
        }

    }

    // InitMember 메서드를 사용하여 반복을 제거하자.
    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
// 객체지향에서, 속성과 기능을 한 곳에 두는 것이 더 나은 방법으로
// MemberInit 또한, 자기 자신의 데이터를 변경하는 기능을 제공하는 것이 좋다.
