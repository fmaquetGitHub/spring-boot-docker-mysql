package com.jiwhiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiwhiz.domain.Person;
import com.jiwhiz.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository repository;

	@RequestMapping("/")
	public String home() {
		Person p = this.repository.findAll().iterator().next();
		return "Hello " + p.getName() + "!";
	}

}
