package com.jiwhiz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiwhiz.domain.Person;
import com.jiwhiz.repository.PersonRepository;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Autowired
	private PersonRepository repository;

	@RequestMapping("/")
	public String home() {
		Person p = this.repository.findAll().iterator().next();
		return "Hello " + p.getName() + "!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);
	}
}
