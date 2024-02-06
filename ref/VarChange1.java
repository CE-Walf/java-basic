package ref;

public class VarChange1 {
    public static void main(String[] args) {
        // 기본형의 경우

        int a = 10;
        int b = a;

        System.out.println("a = " + a); // a = 10
        System.out.println("b = " + b); // b = 10

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // a = 20
        System.out.println("b = " + b); // b = 10

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // a = 20
        System.out.println("b = " + b); // b = 30

        // Java에서 변수의 대입은, 변수에 들어있는 값을 복사해서 대입한다.
    }
}
