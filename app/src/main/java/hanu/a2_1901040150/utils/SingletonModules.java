package hanu.a2_1901040150.utils;

import android.content.Context;

import hanu.a2_1901040150.data.DbHelper;
import hanu.a2_1901040150.data.product.ProductDao;
import hanu.a2_1901040150.data.product.ProductRepositoryImpl;
import hanu.a2_1901040150.data.product.ProductService;
import hanu.a2_1901040150.data.product.ProductServiceImpl;
import hanu.a2_1901040150.domain.ProductRepository;


public class SingletonModules {
    private ProductRepository productRepository;

    public SingletonModules(Context context) {
        initProductRepository(context);
    }

    private void initProductRepository(Context context) {
        ProductService productService = ProductServiceImpl.create();
        DbHelper dbHelper = new DbHelper(context);
        ProductDao productDAO = ProductDao.getInstance(dbHelper);
        productRepository = ProductRepositoryImpl.getInstance(productService, productDAO);
    }

    public ProductRepository getCartRepository() {
        return productRepository;
    }
}
