package com.devteam.liquibase.Controller;

import com.devteam.liquibase.ENTITY.Person;
import com.devteam.liquibase.Repo.PersonRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Rauf Pashayev
 */
@RestController
@RequestMapping("/person")
public class LiquibaseController {

    @Autowired
    PersonRepositroy personRepositroy;


    @PostMapping("/insert")
    private String createPerson(@RequestParam String name) {
        personRepositroy.save(new Person(name, "Azerbaijan Technical University"));
        String toReturn = personRepositroy.finByName(name);

        return personRepositroy.finByName(name) + " Saved Successfully";
    }

    @GetMapping("/getting")
    private List<Person> getAllThePerson() {
        return (List<Person>) personRepositroy.findAll();
    }


}

