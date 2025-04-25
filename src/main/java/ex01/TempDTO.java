package ex01;

import lombok.Data;

// 3번 문제 : 주문 확인 상세 화면 (or2)
// 틀렸음 : DTO 담기
public class TempDTO {

    @Data
    public static class DTO {
        int orderId;
        int productId;
        int productOptionId;
        String productName;
        int qty;
        int totalPrice;

        public DTO(int orderId, int productId, int productOptionId, String productName, int qty, int totalPrice) {
            this.orderId = orderId;
            this.productId = productId;
            this.productOptionId = productOptionId;
            this.productName = productName;
            this.qty = qty;
            this.totalPrice = totalPrice;
        }
    }
}
