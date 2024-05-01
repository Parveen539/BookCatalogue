package com.userservice.userservice.impl;

import com.userservice.userservice.entities.Users;
import com.userservice.userservice.repository.UsersRepository;
import com.userservice.userservice.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users add(Users users) {
        return this.usersRepository.save(users);
    }

    @Override
    public Users findByUsersEmail(String usersEmail) {
        return this.usersRepository.findByUsersEmail(usersEmail);
    }
}
