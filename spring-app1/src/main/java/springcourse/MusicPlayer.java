package springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
   private ClassicalMusic classicalMusic;


    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public MusicPlayer() {
    }


    public void playMusic() {
         {
            System.out.println("Playing: " + classicalMusic.getSong());
        }

    }
}
