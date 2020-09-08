package org.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MusicPlayer {

    Music music1;
    Music music2;
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicalMusic") Music music2){
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(){
        return "Playing: " + music1.getSong() + " and " + music2.getSong();
    }

}
