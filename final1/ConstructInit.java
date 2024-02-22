package final1;

public class ConstructInit {
    final int value;

    // final의 경우 생성자를 통해서 넣어주어야함.
    // 이후에는 이 값을 바꾸는 것이 불가능함.
    public ConstructInit(int value){
        this.value = value;
    }
}
