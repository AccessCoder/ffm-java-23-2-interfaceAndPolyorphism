package de.neuefische;

public class MusicPlayer implements Playable{

    @Override
    public void play(String media) {
        System.out.println(media + " is playing on the Ghettoblaster");
    }
}
