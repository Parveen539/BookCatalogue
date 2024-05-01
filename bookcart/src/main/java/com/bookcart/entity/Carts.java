package com.bookcart.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Carts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartId;
    private long cartBookId;
    private String cartBookTitle;
    private String cartUsersEmail;
    private int cartBookQty;
}
