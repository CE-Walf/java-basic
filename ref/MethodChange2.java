// 참조형과 메서드 호출
package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        // 참조값을 복사하여 ChangeReference의 dataX로 넘어간다.
        // dataA, dataX 둘 다 같은 참조값을 가지게 되어, dataX를 통해서도 Data 인스턴스에 접근 가능하다.
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value); // 메서드 호출 전 : dataA.value = 10
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value); // 메서드 호출 후 : dataA.value = 20
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }
}
