package ru.complexhex.springcourse;

public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;



    }
    public void playMusic(){
        System.out.print("Playing: " + music.getSong());
    }
}
