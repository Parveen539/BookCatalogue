package com.bookservice.purchase.controller;

import com.bookservice.purchase.entities.BookDetails;
import com.bookservice.purchase.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/bookdetails")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<BookDetails> createBookRecord(@RequestBody BookDetails bookDetails) {
        BookDetails newBook = this.bookService.addBook(bookDetails);
        //return ResponseEntity.ofNullable(newBook).getStatusCode();
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newBook);
    }

    @GetMapping
    public ResponseEntity<List<BookDetails>> retrieveAllBooks() {
        List<BookDetails> allBooks = this.bookService.findAll();
        return ResponseEntity.of(Optional.ofNullable(allBooks));
    }
}
