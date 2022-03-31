package ru.complexhex.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> list = new ArrayList<>();
    {
        list.add("Spring");
        list.add("Autumn");
        list.add("Summer");
    }

    @Override
    public List<String> getSong() {
        return list;
    }
}
