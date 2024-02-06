/*
문제와 풀이 1-1.
문제 : 상품 주문 시스템 개발 - 리팩토링
 */
package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];

        // 입력
        orders[0] = createOrder("두부",2000,2);
        orders[1] = createOrder("김치",5000,1);
        orders[2] = createOrder("콜라",1500,2);

        // 출력 - 상품명, 가격, 수량
        printOrders(orders);

        // 출력 - 총 결제 금액
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액 : " + totalAmount);

    }

    // ProductOrder를 생성하고 매개변수로 초기값을 설정한다.
    // 마지막으로 생성한 ProductOrder를 반환한다.
    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    // 배열을 받아서 배열에 들어있는 전체 ProductOrder의 상품명, 가격, 수량을 출력한다.
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    // 배열을 받아서 배열에 들어있는 전체 ProductOrder의 총 결제 금액을 계산하고, 계산 결과를 반환합니다.
    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
