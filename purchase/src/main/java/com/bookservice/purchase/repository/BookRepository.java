package com.bookservice.purchase.repository;

import com.bookservice.purchase.entities.BookDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookDetails, Long> {
}
