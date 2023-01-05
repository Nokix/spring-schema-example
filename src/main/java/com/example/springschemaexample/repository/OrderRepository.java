package com.example.springschemaexample.repository;

import com.example.springschemaexample.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}