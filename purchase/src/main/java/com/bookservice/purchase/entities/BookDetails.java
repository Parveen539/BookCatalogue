package com.bookservice.purchase.entities;

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
public class BookDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bdBookId;
    private String bdBookTitle;
    private String bdBookDesc;
    private int bdBookQty;
    private float bdBookPurchasePrice;
    private float bdBookSalePrice;
}
