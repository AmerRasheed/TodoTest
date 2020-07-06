package org.example.data;

import org.example.model.Person;

import java.util.Collection;

public interface PersonInterfaceClass {
    Person create(Person person);
    Collection<Person> findAll();
    Person findById(int id);
    Collection<Person> findByName(String name);
    boolean deleteById(int id);


    /*create(Person):Person
    findAll():Collection<Person>
    findById(Int):Person
    findByName(String):Collection<Person>
    deleteById(int):boolean*/
}
