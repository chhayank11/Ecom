package com.example.Ecom.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Ecom.model.Order;

public interface OrderRepo extends JpaRepository<Order, Integer> {
	Optional<Order> findByOrderId(String orderId);
}