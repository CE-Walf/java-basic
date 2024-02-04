package class1;
// 클래스에서 만든 맴버변수는 .을 통해 접근 가능하다.
// 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스이다.
// 설계도인 클래스를 사용해서, 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라고 한다.
public class ClassStart3 {
    public static void main(String[] args) {

        Student student1; // 첫 번째 학생 클래스 선언
        student1 = new Student(); // 실제 메모리 데이터를 만든다.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); // 두 번째 학생 클래스 선언 및 객체 생성
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + ", 나이 : " + student1.name + ", 성적 : " +student1.grade);
        System.out.println("이름 : " + student2.name + ", 나이 : " + student2.name + ", 성적 : " +student2.grade);
    }
}
/*
클래스는 설계도 이며, 이 설계도를 기반으로 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다. 둘 다 같은 의미로 사용된다.
 */
