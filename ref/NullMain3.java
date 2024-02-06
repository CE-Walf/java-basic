package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.count = " + bigData.data);

        // NullPointerException 발생, null에 '.'을 찍은 것이므로
        System.out.println("bigData.data.value = " + bigData.data.value);

    }
}
