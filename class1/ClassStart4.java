package class1;

// Studnet 타입을 사용하는 배열을 도입해보자.
public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // Student 배열 생성하기
        Student[] students = new Student[2]; // Student 변수를 2개 보관할 수 있는 배열을 만든다.
        // 지금 배열은, 아직 참조값을 대입하지 않았기 때문에, 참조값이 없다는 의미의 null로 초기화 된다.

        // 자바에서 대입은 항상 변수에 들어있는 값을 복사한다.
        students[0] = student1; // 배열에 student1 인스턴스의 참조값 보관
        students[1] = student2; // 배열에 student2 인스턴스의 참조값 보관
        // 이렇게 참조값을 읽고 복사해서 배열에 대입해준다.
        // 이제 배열은 참조값을 갖게 되었으므로, 학생1과 학생2 Student 인스턴스에 모두 접근할 수 있다.

        System.out.println("이름 : " + students[0].name + ", 나이 : " + students[0].age + ", 성적 : " + students[0].grade);
        System.out.println("이름 : " + students[1].name + ", 나이 : " + students[1].age + ", 성적 : " + students[1].grade);
    }
}
// 주의 : 여기서 변수에는 인스턴스의 위치를 가리키는 참조값이 들어있는 것