package com.github.rbaul.demo.web;

import com.github.rbaul.demo.model.Person;
import com.github.rbaul.demo.services.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/persons")
public class PersonController {

    private final PersonService personService;

    @GetMapping
    public List<Person> getAllPersonsRegular() {
        return personService.getAllPersons();
    }

    @GetMapping("/search")
    public List<Person> searchPersons(@RequestParam String name) {
        return personService.getPersonsByName(name);
    }
}
