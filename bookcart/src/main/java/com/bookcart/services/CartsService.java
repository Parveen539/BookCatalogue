package com.bookcart.services;

import com.bookcart.entity.Carts;

import java.util.List;

public interface CartsService {
    Carts addCart(Carts carts);
    List<Carts> retrieveAll();
    List<Carts> retrieveCartUsersEmail(String cartUsersEmail);
}
