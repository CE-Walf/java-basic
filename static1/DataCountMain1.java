package static1;

public class DataCountMain1 {
    public static void main(String[] args) {
        // 객체가 생성될 때 마다, 0 -> 1이 되므로 결과값으로 모두 1이 나오게 된다.

        Data1 data1 = new Data1("A");
        System.out.println("A count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("B count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("C count = " + data3.count);
    }
}
