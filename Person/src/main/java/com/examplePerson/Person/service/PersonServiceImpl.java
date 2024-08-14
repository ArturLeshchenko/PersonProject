package com.examplePerson.Person.service;

import com.examplePerson.Person.entity.Person;
import com.examplePerson.Person.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;


    @Override
    public Person addPerson(Person person) {
        // логика для проверки в военкомат
        return  personRepository.saveAndFlush(person);
    }

    @Override
    public void deletePerson(Long id) throws Exception {
        personRepository.deleteById(id);
    }

    @Override
    public List<Person> getAll() {
        return personRepository.findAll();;
    }

    @Override
    public Person getOnePerson(Long id) throws Exception {
        Optional<Person> optionalPerson = personRepository.findById(id);
        return optionalPerson.orElseThrow(() -> new Exception("Человек не найден"));
    }

    @Override
    public Person putPerson(Long id, Person person) {
        Optional<Person> optionalPerson = personRepository.findById(id);
        return personRepository.saveAndFlush(person);
    }
}