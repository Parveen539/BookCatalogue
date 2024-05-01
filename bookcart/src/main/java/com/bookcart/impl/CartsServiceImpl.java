package com.bookcart.impl;

import com.bookcart.entity.Carts;
import com.bookcart.repository.CartsRepo;
import com.bookcart.services.CartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartsServiceImpl implements CartsService {

    @Autowired
    private CartsRepo cartsRepo;

    @Override
    public Carts addCart(Carts carts) {
        return this.cartsRepo.save(carts);
    }

    @Override
    public List<Carts> retrieveAll() {
        return this.cartsRepo.findAll();
    }

    @Override
    public List<Carts> retrieveCartUsersEmail(String cartUsersEmail) {
        return this.cartsRepo.findByCartUsersEmail(cartUsersEmail);
    }
}
