package com.example.springschemaexample.repository;

import com.example.springschemaexample.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}