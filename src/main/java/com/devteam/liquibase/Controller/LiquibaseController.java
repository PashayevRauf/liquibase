package com.devteam.liquibase.Controller;

import com.devteam.liquibase.ENTITY.Person;
import com.devteam.liquibase.Repo.PersonRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class LiquibaseController {

    @Autowired
    PersonRepositroy personRepositroy;


    @PostMapping("/person")
    private String createPerson(@RequestParam String name) {
        personRepositroy.save(new Person(name, "6.7"));
        return personRepositroy.finByName(name) + " Saved Successfully";
    }

    @GetMapping("/person")
    private List<Person> getAllThePerson() {
        return (List<Person>) personRepositroy.findAll();
    }


}

