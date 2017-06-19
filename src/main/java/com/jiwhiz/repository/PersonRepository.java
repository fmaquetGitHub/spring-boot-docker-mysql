package com.jiwhiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jiwhiz.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
