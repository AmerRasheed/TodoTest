package org.example.data;

import org.example.model.Person;

import java.util.Collection;
import java.util.Optional;

public class PersonInterfaceClassRepository implements PersonInterfaceClass {
    @Override
    public Person create(Person person) {
        PersonDAO PersonDAO = new PersonDAO();
        person = PersonDAO.create(person);
        System.out.println(person);
        return person;
    }

    @Override
    public Collection<Person> findAll() {
        return null;
    }

    @Override
    public Person findById(int id) {

       //Optional<Person> optionalPeople = Optional.empty();
        return null;
    }

    @Override
    public Collection<Person> findByName(String name) {
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }
}
