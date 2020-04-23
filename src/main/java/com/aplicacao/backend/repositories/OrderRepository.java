package com.aplicacao.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacao.backend.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
