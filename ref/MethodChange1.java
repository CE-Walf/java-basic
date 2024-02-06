// 기본형과 메서드 호출

package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        // Java에서는 항상 값을 복사해서 대입한다.
        // 메서드 호출할 때 사용하는 매개변수도 결국 변수이다.
        // 메서드를 호출할 때 매개변수에 값을 전달하는 것도, 값을 복사해서 전달한다.
        int a = 10;
        System.out.println("메서드 호출 전 : a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 : a = " + a);
    }

    static void changePrimitive(int x){
        x = 20;
    }
}
