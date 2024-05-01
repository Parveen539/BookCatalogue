package com.userservice.userservice.service;

import com.userservice.userservice.entities.Users;

public interface UsersService {
    Users add(Users users);
    Users findByUsersEmail(String usersEmail);
}
