package ru.complexhex.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.complexhex.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Ben"));
        people.add(new Person(++PEOPLE_COUNT, "Pip"));
        people.add(new Person(++PEOPLE_COUNT, "Ron"));
        people.add(new Person(++PEOPLE_COUNT, "Lisa"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);

        people.add(person);
    }

    public void update(int id, Person person) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(person.getName());

    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }


}
