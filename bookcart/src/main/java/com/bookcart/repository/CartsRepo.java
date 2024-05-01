package com.bookcart.repository;

import com.bookcart.entity.Carts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartsRepo extends JpaRepository<Carts, Long> {

    List<Carts> findByCartUsersEmail(String cartUsersEmail);
}
