package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 : " + student1Name + ", 나이 : " + student1Age + ", 성적 : " + student1Grade);
        System.out.println("이름 : " + student2Name + ", 나이 : " + student2Age + ", 성적 : " + student2Grade);
        // 이러한 방식으로 진행하였을때 단점 -> 학생이 생길때마다 변수를 추가해주어야함.
        // 이런 문제를 해결하여 보자.
    }
}
