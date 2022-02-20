package springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList();

    {
        Collections.addAll(songs, "Cl1", "Cl2", "Cl3");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
