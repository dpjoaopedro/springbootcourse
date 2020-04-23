package com.aplicacao.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacao.backend.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
