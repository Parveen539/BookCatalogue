package com.bookservice.purchase.impl;

import com.bookservice.purchase.entities.BookDetails;
import com.bookservice.purchase.repository.BookRepository;
import com.bookservice.purchase.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;


    @Override
    public BookDetails addBook(BookDetails bookDetails) {
        return this.bookRepository.save(bookDetails);
    }

    @Override
    public List<BookDetails> findAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public BookDetails findById(long id) {
        return this.bookRepository.findById(id).orElseThrow(() -> new RuntimeException("ID not found!!"));
    }
}
