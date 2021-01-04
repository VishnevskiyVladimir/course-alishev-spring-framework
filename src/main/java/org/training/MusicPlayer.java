package org.training;

public class MusicPlayer {
    private Music song1;
    private Music song2;



    // IoC
    public MusicPlayer(Music music) {
        this.song1 = music;
    }



    public void setSong2(Music song2) {
        this.song2 = song2;
    }



    public void playMusic() {
        System.out.println("This bean injected through constructor and defined in xml configuration. Value: " + song1.getSong());
        System.out.println("This bean injected through setter and defined in xml configuration. Value: " + song2.getSong());
    }
}
