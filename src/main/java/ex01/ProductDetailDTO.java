package ex01;


import lombok.Data;

import java.util.List;

// 2번 문제 : 상품 상세 화면 (p2)
// Product(p2, p2Options) -> ProductDetail
@Data
public class ProductDetailDTO {
    private int productId;
    private List<ProductOption> productOptions;

    @Data
    public static class ProductOption {
        private int optionId;
        private String optionName;
        private int qty;
        private int price;

        public ProductOption(int optionId, String optionName, int qty, int price) {
            this.optionId = optionId;
            this.optionName = optionName;
            this.qty = qty;
            this.price = price;
        }
    }

    public ProductDetailDTO(int productId, List<ProductOption> productOptions) {
        this.productId = productId;
        this.productOptions = productOptions;
    }
}
