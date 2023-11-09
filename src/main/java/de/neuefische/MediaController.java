package de.neuefische;

public class MediaController {

    /**
     Schritt 4: Erstellt eine Klasse 'MediaController', die eine Methode
     'playMedia' enthält. Diese Methode soll ein
     'Playable'-Objekt als Parameter akzeptieren und die 'play'-Methode aufrufen.
     */

    public void playMedia(Playable playable, String media){
        playable.play(media);
    }

}
