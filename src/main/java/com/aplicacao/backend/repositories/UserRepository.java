package com.aplicacao.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplicacao.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
