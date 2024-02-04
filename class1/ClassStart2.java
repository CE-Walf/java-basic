package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        // 배열을 사용하여 이러한 문제들을 해결해보자.
        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15,16};
        int[] studentGrades = {90,80};

        for(int i = 0; i < studentNames.length; i++){
            System.out.println("이름 : " + studentNames[i] + ", 나이 : " + studentAges[i] + ", 성적 : " + studentGrades[i]);
        }

        // 코드 변경을 최소화하는데에 성공하였지만, 한 학생의 데이터가 3개의 변수로 나누어져 있으므로, 변수를 변경할때 조심해야 한다.
        // 특정 학생의 데이터를 변경할 때 실수할 가능성이 매우 높다. 컴퓨터가 볼 때는 문제가 없지만, 사람이 관리하기에 좋은 코드가 아니다.
        // 학생별로 묶어서 관리하는 것은 어떨까?
    }
}
