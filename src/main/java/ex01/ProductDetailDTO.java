package ex01;


import lombok.Data;
import model.Product;
import model.ProductOption;

import java.util.ArrayList;
import java.util.List;

// 2번 문제 : 상품 상세 화면 (p2)
// Product(p2, p2Options) -> ProductDetail
@Data
public class ProductDetailDTO {
    private Integer productId;
    private String productName;
    List<ProductOptionDTO> options = new ArrayList<>();

    public ProductDetailDTO(Product p, List<ProductOption> options) {
        this.productId = p.getId();
        this.productName = p.getName();
        for (ProductOption op : options) {
            this.options.add(new ProductOptionDTO(op));
        }
    }

    @Data
    public class ProductOptionDTO {
        private int optionId;
        private String optionName;
        private int optionPrice;
        private int optionQty;

        public ProductOptionDTO(ProductOption op) {
            this.optionId = op.getId();
            this.optionName = op.getName();
            this.optionPrice = op.getPrice();
            this.optionQty = op.getQty();
        }
    }
}
