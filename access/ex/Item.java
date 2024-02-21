package access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;

    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // private 이므로, 이름에 접근하기 위한 메서드
    public String getName(){
        return name;
    }

    public int getTotalPrice() {
        return price * quantity;
    }


}
