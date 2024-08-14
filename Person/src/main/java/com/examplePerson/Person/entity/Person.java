package com.examplePerson.Person.entity;

import lombok.Data;

@Data
@Entity
@Table (name = "person")
public class Person {

    @Id
    @GeneratedValue (strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column (name = "Имя")
    private String name;

    @Column (name = "Фамилия")
    private String secondName;

    @Column ( name = "Возрраст")
    private int age;

    @Column(name = "Пол")
    private String sex;

    @Column ( name = "Прописка")
    private String propiska;

    @Column ( name = "Здоровье")
    private String health;
