// 메서드 내부에서 전달된 참조값을 통해 객체의 값을 변경하거나, 값을 읽어서 사용할 수 있다.
package ref;

public class Method1 {
    public static void main(String[] args) {
        // 메서드를 통해 입력해보자.
        Student student1  = new Student();;
        initStudent(student1, "학생1", 15, 90);

        Student student2 = new Student();
        initStudent(student2, "학생2", 16,90);

        // 메서드를 통해 출력해보자.
        printStudent(student1);
        printStudent(student2);
    }

    // 전달한 학생 객체의 필드에 값을 설정한다.
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    // 전달한 학생 객체의 필드 값을 읽어서 출력한다.
    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 성적 : " +student.grade);
    }
}
