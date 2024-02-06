package ref;

public class NullMain1 {
    public static void main(String[] args) {
        // 아직 data 변수에는 가리키는 객체가 없다. -> null
        Data data = null;
        System.out.println("1. data = " + data); // null

        // 새로운 Data 객체를 생성해서, 그 참조값을 data 변수에 할당했으므로 data 변수가 참조할 객체가 존재한다.
        data = new Data();
        System.out.println("2. data = " + data); // 참조값

        // 참조값을 더 이상 안쓰기 위해 다시 null을 넣는다면,
        data = null;
        System.out.println("3. data = " + data); // null

        // 아무도 참조하지 않는 인스턴스는 Garbage Collection를 사용해 제거된다.
    }
}
