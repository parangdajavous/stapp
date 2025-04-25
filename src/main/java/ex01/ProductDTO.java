package ex01;


import lombok.Data;
import model.Product;

// 1번 문제 : 상품 목록 화면
// List<Product> -> List<ProductDTO>
@Data
public class ProductDTO {
    private int id;
    private String name;

    public ProductDTO(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
    }
}