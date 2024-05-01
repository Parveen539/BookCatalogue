package com.userservice.userservice.repository;

import com.userservice.userservice.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Users findByUsersEmail(String usersEmail);
}
