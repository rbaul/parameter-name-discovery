package com.github.rbaul.demo.repository;

import com.github.rbaul.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Short> {
    boolean deleteByName(String name);

    List<Person> findByName(String name);
}
