package com.bookcart.controller;

import com.bookcart.entity.Carts;
import com.bookcart.services.CartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/carts")
public class CartsController {

    @Autowired
    private CartsService cartsService;

    //create
    @PostMapping
    public Carts addCartsRecord(@RequestBody Carts carts) {
        return this.cartsService.addCart(carts);
    }

    //get all
    @GetMapping
    public List<Carts> retrieveAllCartItem() {
        return this.cartsService.retrieveAll();
    }

    //get for Email
    @GetMapping("/{email}")
    public List<Carts> retrieveCartItemOfEmail(@PathVariable String email) {
        return this.cartsService.retrieveCartUsersEmail(email);
    }
}
