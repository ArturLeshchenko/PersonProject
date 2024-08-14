package com.examplePerson.Person.repository;

import com.examplePerson.Person.entity.Person;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepository extends JpaRepository <Person, Long> {
}
