package com.example.liquebasedemo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {

    @Query("select name from Person p where p.name like %:personName%")
    String findByName(String personName);
}
