package com.bookorders.controller;

import com.bookorders.entities.Orders;
import com.bookorders.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    //create record
    @PostMapping
    public ResponseEntity<Orders> createRecord(@RequestBody Orders orders) {
        Orders orders1 = this.ordersService.addRecord(orders);
        if (orders1 != null) {
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(orders1);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }
    }

    //get all record
    @GetMapping
    public ResponseEntity<List<Orders>> getAllRecord() {
        List<Orders> allRecord = this.ordersService.findAllRecord();
        if (allRecord != null) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(allRecord);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }
    }

    //get record for email
    @GetMapping("/{email}")
    public ResponseEntity<List<Orders>> getAllRecordsForMail(@PathVariable String email) {
        List<Orders> recordForEmail = this.ordersService.findRecordForEmail(email);
        if (recordForEmail != null) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(recordForEmail);
        } else {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .build();
        }
    }
}
