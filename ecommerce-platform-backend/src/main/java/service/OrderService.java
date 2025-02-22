package service;

    import com.ecommerce.entity.Order;
import com.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class OrderService {
        @Autowired
        private OrderRepository orderRepository;

        public List<Order> getAllOrders() {
            return orderRepository.findAll();
        }

        public Order saveOrder(Order order) {
            return orderRepository.save(order);
        }
    }


