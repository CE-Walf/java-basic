// 패키지를 구성할 때 서로 관련된 클래스는 하나의 패키지로 모으고, 관련이 적은 클래스는 다른 패키지로 분리하는 것이 좋다.

package com.helloshop.order;

import com.helloshop.product.Product; // import Product
import com.helloshop.user.User; // import User

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
