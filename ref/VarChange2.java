package ref;

public class VarChange2 {
    public static void main(String[] args) {
        // 참조형의 경우

        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; // A의 참조값을 dataB에 복사

        // dataA와 dataB는 같은 참조값을 가진다.
        // dataA와 dataB 이 두 변수는 같은 객체 인스턴스를 참조하게 된다.
        System.out.println("dataA 참조값 = " + dataA);
        System.out.println("dataB 참조값 = " + dataB);
        System.out.println("dataA.value = " + dataA.value); // dataA.value = 10
        System.out.println("dataB.value = " + dataB.value); // dataB.value = 10

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value); // dataA.value = 20
        System.out.println("dataB.value = " + dataB.value); // dataB.value = 20

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value); // dataA.value = 30
        System.out.println("dataB.value = " + dataB.value); // dataB.value = 30

        // 참조형은 주소를 읽어오므로, dataA가 바뀌더라도, B도 같이 바뀌게 된다.
    }
}
