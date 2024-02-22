package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        // static이 붙은 정적 변수에 접근하려면, Data3.count와 같이 클래스명 + .(dot) + 변수명으로 접근하면 된다.
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); // data1.count가 아닌, Data3.count

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("A count = " + Data3.count);

        // 추가
        // 인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count); // 권장 X, 인스턴스 변수로 오해할 수도 있기 때문에

        // 클래스를 통한 접근
        System.out.println(Data3.count);

    }
}
