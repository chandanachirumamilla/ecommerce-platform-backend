package ecommerce.entity;


import javax.persistence.*;
import java.util.Date;

    @Entity
    public class Order {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private User user;

        private Date orderDate;
        private String status;

        // Getters and Setters
    }



