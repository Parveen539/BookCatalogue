package com.bookorders.service;

import com.bookorders.entities.Orders;

import java.util.List;

public interface OrdersService {
    Orders addRecord(Orders orders);
    List<Orders> findAllRecord();
    List<Orders> findRecordForEmail(String ordersUsersEmail);
}
