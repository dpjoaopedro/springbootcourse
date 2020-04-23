package com.aplicacao.backend.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aplicacao.backend.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "9999", "12345");
		return ResponseEntity.ok().body(u);
	}

}
