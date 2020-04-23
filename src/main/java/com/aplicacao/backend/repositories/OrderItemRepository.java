package com.aplicacao.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacao.backend.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
