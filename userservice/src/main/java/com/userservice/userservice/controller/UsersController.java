package com.userservice.userservice.controller;

import com.userservice.userservice.entities.Users;
import com.userservice.userservice.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @PostMapping
    public ResponseEntity<Users> addUsers(@RequestBody Users users) {
        Users newUser = this.usersService.add(users);
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newUser);
    }

    @GetMapping("/{email}")
    public ResponseEntity<Users> retrieveUser(@PathVariable String email) {
        Users retrievedUser = this.usersService.findByUsersEmail(email);
        System.out.println(retrievedUser);
        if (retrievedUser == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(null);
        } else {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(retrievedUser);
        }

    }
}
