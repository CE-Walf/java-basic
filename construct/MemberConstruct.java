/*
생성자 - 도입
대부분의 객체 지향 언어는, 객체를 생성하자마자 즉시 필요한 기능을 더 편리하게 수행할 수 있도록 생성자라는 기능 제공
*/
package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 추가 (생성자 오버로딩)
    // 이름과 나이만 있을경우, 성적은 50점으로
    MemberConstruct(String name, int age){
        // this()를 사용하여, 생성자 내부에서 자신의 생성자를 호출하여 중복 제거
        // this()는 생성자 코드의 첫줄에만 작성 가능하다.
        this(name, age, 50); // 변경
    }

    // 생성자
    // 생성자의 이름은 클래스와 이름이 같아야 한다. (따라서 첫 글자도 대문자로 시작)
    // 생성자는 반환타입이 없다.
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
