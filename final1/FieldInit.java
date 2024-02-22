package final1;

public class FieldInit {
    // static final이 붙으면, 관례상 대문자로 변수 선언 해야함 (상수)
    static final int CONST_VALUE = 10;
    final int value = 10;

    // 오류
    // final은 값이 한 번 생성되면 끝이다.
//    public FieldInit(int value){
//        this.value = value;
//    }
}