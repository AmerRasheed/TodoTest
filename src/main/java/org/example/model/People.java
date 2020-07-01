package org.example.model;

import java.util.Objects;

public class People {
    int personId;
    String firstName;
    String lastName;

    public People(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public People(String firstName, String lastName) {
        this(0,"Amer","Rasheed");
        }

    public int getPersonId() {
        return personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return personId == people.personId &&
                Objects.equals(firstName, people.firstName) &&
                Objects.equals(lastName, people.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, firstName, lastName);
    }

    @Override
    public String toString() {
        return "People{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
