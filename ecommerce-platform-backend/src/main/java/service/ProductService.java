package service;

    import com.ecommerce.entity.Product;
import com.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class ProductService {
        @Autowired
        private ProductRepository productRepository;

        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }

        public Product saveProduct(Product product) {
            return productRepository.save(product);
        }
    }


