package ru.complexhex.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> list = new ArrayList<>();

    {
        list.add("RockSpring");
        list.add("RockAutumn");
        list.add("RockSummer");
    }

    @Override
    public List<String> getSong() {
        return list;
    }


}
