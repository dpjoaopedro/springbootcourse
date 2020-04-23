package com.aplicacao.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacao.backend.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
