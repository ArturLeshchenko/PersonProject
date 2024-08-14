package com.examplePerson.Person.controller;

import com.examplePerson.Person.entity.Person;
import com.examplePerson.Person.repository.PersonRepository;
import com.examplePerson.Person.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;
    private final PersonRepository personRepository;

    @PostMapping("/add")
    public Person addPerson (@RequestBody Person person) {
        return personService.addPerson(person);
    }

    @DeleteMapping ("/delete/{id}")
    public void deletePerson (@PathVariable Long id) throws Exception {
        personService.deletePerson(id);
    }


    @PutMapping("put/{id}")
    public Person updateUser(@PathVariable Long id, @RequestBody Person person) {
        return personService.putPerson(id,person);
    }

    @GetMapping ("/getAll")
    public List<Person> getAllPerson() {
        return  personService.getAll();
    }

    @GetMapping ("/getOne/{id}")
    public Person getOnePerson(@PathVariable Long id) throws Exception {
        return personService.getOnePerson (id);
    }

    @GetMapping ("/getAllVoenkomat")
    public void goVoenkom() throws Exception {
        //   personService.goVoenkom();
    }


}
