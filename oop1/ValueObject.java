package oop1;


// 데이터인 value와, 데이터를 사용하는 기능인 add() 메서드를 함께 정의
public class ValueObject {
    int value;

    // 메서드는 객체를 생성해야 호출할 수 있다.
    // static이 붙으면 객체를 생성하지 않고도 메서드를 호출 가능하다.
    void add() {
        value++;
        System.out.println("숫자 증가 value = " + value);
    }
}
