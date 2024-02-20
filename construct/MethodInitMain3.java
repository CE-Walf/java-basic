/*
MethodInitMain1의 단점은, 코드에서 회원의 초기값을 설정하는 부분이 반복된다는 것이다.
메서드를 사용해서 반복을 제거해 보자.
 */

package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1", 15, 90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2", 16, 80);

        MemberInit[] members = {member1, member2};

        for (MemberInit s : members) {
            System.out.println("이름 : " + s.name + ", 나이 : " + s.age + ", 성적 : " + s.grade);        }

    }
}