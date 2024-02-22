package final1;

public class finalRefMain {
    public static void main(String[] args){
        //final을 참조형 변수에 사용하면 참조값을 변경할 수 없다.
        final Data data = new Data();
        // data = new Data(); // final 변경 불가 컴파일 오류

        // 참조 대상의 "값"은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);

    }
}
