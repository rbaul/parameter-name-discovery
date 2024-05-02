package com.github.rbaul.demo.services;

import com.github.rbaul.demo.model.Person;
import com.github.rbaul.demo.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository repository;

    public List<Person> getAllPersons() {
        return repository.findAll();
    }

    public void create(List<Person> persons) {
        repository.saveAll(persons);
    }

    public void removeByName(String name) {
        repository.deleteByName(name);
    }

    public List<Person> getPersonsByName(String name) {
        return repository.findByName(name);
    }
}
