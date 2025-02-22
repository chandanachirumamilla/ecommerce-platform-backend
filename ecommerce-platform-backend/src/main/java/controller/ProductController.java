package controller;

    import com.ecommerce.entity.Product;
import com.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/products")
    public class ProductController {
        @Autowired
        private ProductService productService;

        @GetMapping
        public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

        @PostMapping
        public Product addProduct(@RequestBody Product product) {
            return productService.saveProduct(product);
        }
    }


