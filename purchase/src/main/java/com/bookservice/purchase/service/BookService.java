package com.bookservice.purchase.service;

import com.bookservice.purchase.entities.BookDetails;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    BookDetails addBook(BookDetails bookDetails);
    List<BookDetails> findAll();
    BookDetails findById(long id);
}
