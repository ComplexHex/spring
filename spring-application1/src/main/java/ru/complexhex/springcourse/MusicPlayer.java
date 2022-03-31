package ru.complexhex.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(RockMusic rockMusic, ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }

    public void playMusic(TypeOfMusic typeOfMusic) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (typeOfMusic == TypeOfMusic.CLASSICAL) {
            System.out.println(("Playing: " + classicalMusic.getSong().get(randomNumber)));
        } else {
            System.out.println(("Playing: " + rockMusic.getSong().get((randomNumber))));
        }

    }
}
