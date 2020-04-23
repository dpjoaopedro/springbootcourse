package com.aplicacao.backend.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.aplicacao.backend.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		User u1 = new User(1L, "Maria", "maria@gmail.com", "9999", "12345");
		User u2 = new User(2L, "Joao", "Joao@gmail.com", "9999", "12345");
		User u3 = new User(3L, "Carlos", "carlos@gmail.com", "9999", "12345");
		List<User> list = new ArrayList<>();
		list.add(u1);
		list.add(u2);
		list.add(u3);

		return ResponseEntity.ok().body(list);
	}

}
