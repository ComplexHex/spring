package springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(TypeOfMusic typeOfMusic) {
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        if (typeOfMusic == TypeOfMusic.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(randomNumber));
        }
        if (typeOfMusic == TypeOfMusic.ROCK) {
            System.out.println(rockMusic.getSongs().get(randomNumber));
        }
    }
}

