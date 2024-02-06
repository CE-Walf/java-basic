package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); // 이런식으로 하면 null이 아니기 때문에 NullPointerException이 발생하지 않게 된다.
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.count = " + bigData.data);

        System.out.println("bigData.data.value = " + bigData.data.value);

        // NullPointerException이 발생하면, null 값에 . (dot)을 찍었다고 생각하면 문제를 쉽게 찾을 수 있다.
    }
}
