package com.example.connecttest.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository repo;

    @Autowired
    public PersonService(PersonRepository repo) {
        this.repo = repo;
    }

    public void addPerson(Person person){
        repo.save(person);
    }
}
