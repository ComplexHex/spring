package springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class RockMusic implements Music {
   private List<String> songs = new ArrayList();

    {Collections.addAll(songs, "R1", "R2", "R3");}

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
