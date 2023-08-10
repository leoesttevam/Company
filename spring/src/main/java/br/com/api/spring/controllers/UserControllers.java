package br.com.api.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.spring.model.User;
import br.com.api.spring.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserControllers {

	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> buscar() {
		List<User> us = repository.findAll();
		
		return us;
	}
}
