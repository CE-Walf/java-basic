package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    // 생성자
    public MaxCounter(int max) {
        this.max = max;
    }

    // 숫자를 하나 증가한다.
    public void increment() {
        if (count < max){
            count += 1;
        } else {
            System.out.println("최대값을 초과할 수 없습니다.");
        }
    }

    // 지금까지 증가한 값을 반환한다.
    public int getCount(){
        return count;
    }

}
