package com.example.liquebasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    int i=34;
    @Autowired
    private PersonRepository repository;

    @PostMapping("person")
    public String createPerson(@RequestParam String name){
        repository.save(new Person(name,"234","erbil"));
        return repository.findByName(name);
    }

    @GetMapping("person")
    public List<Person> getall(){
        return (List<Person>) repository.findAll();
    }


    @GetMapping("wee")
    public List<Person> getallqq(){
        return (List<Person>) repository.findAll();
    }

    @GetMapping("wee11")
    public List<Person> getallqqqq(){
        return (List<Person>) repository.findAll();
    }
}
