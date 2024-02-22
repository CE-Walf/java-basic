package static1;

public class Data3 {
    public String name;
    // static이 붙은 맴버 변수는 인스턴스 영역이 아니라 메서드 영역에서 관리
    public static int count; // static

    public Data3(String name){
        this.name = name;
        count++; // 생성자가 호출될때마다 count 1증가
    }
}
