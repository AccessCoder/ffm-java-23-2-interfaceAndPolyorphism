package de.neuefische;

public class VideoPlayer implements Playable{
    @Override
    public void play(String media) {
        System.out.println(media + " is playing on the TV");
    }
}
