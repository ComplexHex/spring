package springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class RockMusic implements Music {
    private String song;


    @Override
    public String getSong() {
        return song;
    }
}
