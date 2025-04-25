package ex01;


import lombok.Data;

import java.util.List;

// 4번 문제 : 주문 확인 상세 화면 (or1)
// (orOption1, orOption2), (orOption3) -> OrderDetailDTO
@Data
public class OrderDetailDTO {

    @Data
    public static class DTO {
        private int orderId;
        private List<ProductDTO> products;
        private int sumPrice;


        public static class ProductDTO {
            private int productId;
            private List<ProductOptionDTO> options;

            public ProductDTO(int productId, List<ProductOptionDTO> options) {
                this.productId = productId;
                this.options = options;
            }

            public static class ProductOptionDTO {
                private int id;
                private String name;
                private int qty;
                private int totalPrice;

                public ProductOptionDTO(int id, String name, int qty, int totalPrice) {
                    this.id = id;
                    this.name = name;
                    this.qty = qty;
                    this.totalPrice = totalPrice;
                }
            }
        }

        public DTO(int orderId, List<ProductDTO> products, int sumPrice) {
            this.orderId = orderId;
            this.products = products;
            this.sumPrice = sumPrice;
        }


    }

}
