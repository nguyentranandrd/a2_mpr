package hanu.a2_1901040150.domain;


import java.util.List;

import hanu.a2_1901040150.data.product.ProductDto;
import hanu.a2_1901040150.data.product.ProductEntity;

public interface ProductRepository {
    List<ProductDto> fetchProducts();

    ProductEntity getExistedProductInCart(int id);

    long addProductToCast(ProductEntity productEntity);

    boolean updateProductQuantity(int id, int newQuantity);

    List<ProductEntity> getProductsInCart();

    boolean deleteProductInCart(int id);
}
