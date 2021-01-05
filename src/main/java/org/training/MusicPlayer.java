package org.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {


    private Music song1;




    public MusicPlayer(@Qualifier("classicalMusic")  Music music) {
        System.out.println("DI through constructor");
        this.song1 = music;
    }



    public void playMusic() {
        System.out.println("This bean injected through constructor and defined in xml configuration. Value: " + song1.getSong());
    }
}
