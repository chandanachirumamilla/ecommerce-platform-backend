package controller;

    import com.ecommerce.entity.Order;
import com.ecommerce.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api/orders")
    public class OrderController {
        @Autowired
        private OrderService orderService;

        @GetMapping
        public List<Order> getAllOrders() {
            return orderService.getAllOrders();
        }

        @PostMapping
        public Order addOrder(@RequestBody Order order) {
            return orderService.saveOrder(order);
        }
    }


