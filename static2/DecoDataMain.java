package static2;

// 이렇게 할 경우, staticCall()를 호출할때 클래스명을 적을 필요가 없다.
//import static static2.DecoData.staticCall;
//import static static2.DecoData.*;  // 모든 static 메서드를 class명 생략하고 쓰려면 이렇게.

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData(); // 인스턴스 변수는 Heap 영역에 다시 생성되므로 1임.
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근
        DecoData.staticCall();
    }
}
