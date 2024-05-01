package com.bookorders.repository;

import com.bookorders.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
    List<Orders> findByOrdersUsersEmail(String ordersUsersEmail);
}
