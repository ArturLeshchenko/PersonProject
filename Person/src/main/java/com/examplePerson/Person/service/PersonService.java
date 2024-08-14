package com.examplePerson.Person.service;

import com.examplePerson.Person.entity.Person;

import java.util.List;

public interface PersonService {
    Person addPerson (Person person) ;
    void deletePerson (Long id) throws Exception;
    List<Person> getAll ();
    Person getOnePerson (Long id) throws Exception;
    Person putPerson (Long id, Person person);
}
