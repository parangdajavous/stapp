package ex01;

import lombok.Data;
import model.OrderOption;

// 3번 문제 : 주문 확인 상세 화면 (or2)
// 틀렸음 : DTO 담기
@Data
public class TempDTO {

    private Integer orderId;
    private Integer productId;
    private Integer orderOptionId;
    private String orderOptionName;
    private Integer orderOptionQty;
    private Integer totalPrice;

    public TempDTO(OrderOption orderOption) {
        this.orderId = orderOption.getOrder().getId();
        this.productId = orderOption.getProduct().getId(); // Lazy Loading (조인 안했다면)
        this.orderOptionId = orderOption.getId();
        this.orderOptionName = orderOption.getOptionName();
        this.orderOptionQty = orderOption.getQty();
        this.totalPrice = orderOption.getTotalPrice();
    }
}
