package ru.complexhex.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.complexhex.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private List<Person> people;

    {
         people = new ArrayList<>();

         people.add(new Person(1, "Ben"));
         people.add(new Person(2, "Pip"));
         people.add(new Person(3, "Ron"));
         people.add(new Person(4, "Lisa"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }



}
