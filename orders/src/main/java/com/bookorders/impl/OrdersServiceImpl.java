package com.bookorders.impl;

import com.bookorders.entities.Orders;
import com.bookorders.repository.OrdersRepository;
import com.bookorders.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Orders addRecord(Orders orders) {
        return this.ordersRepository.save(orders);
    }

    @Override
    public List<Orders> findAllRecord() {
        return this.ordersRepository.findAll();
    }

    @Override
    public List<Orders> findRecordForEmail(String ordersUsersEmail) {
        return this.ordersRepository.findByOrdersUsersEmail(ordersUsersEmail);
    }
}
