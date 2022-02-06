package com.devteam.liquibase.Repo;

import com.devteam.liquibase.ENTITY.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("PersonRepositroy")
public interface PersonRepositroy extends CrudRepository<Person, Integer> {

    @Query("SELECT name FROM Person p WHERE p.name LIKE %:personName%")
    String finByName(String personName);

}
