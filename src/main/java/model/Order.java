package model;


import lombok.Builder;
import lombok.Data;

// ex. 주문 - 주문한 상품의 주문번호가 있는 class
@Data
public class Order {
    private int id;

    @Builder
    public Order(int id) {
        this.id = id;
    }


}
