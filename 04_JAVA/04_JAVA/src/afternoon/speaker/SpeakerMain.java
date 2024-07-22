package afternoon.speaker;

import afternoon.speaker.set.Speaker;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker();

        speaker.getVolume();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        //speaker.getVolume();

        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        speaker.volumeDown();
        //speaker.getVolume();

        speaker.volumeMute();
       // speaker.getVolume();
        speaker.volumeDown();
       // speaker.getVolume();

        for(int i = 0; i < 100 ; i++){
            speaker.volumeUp();
        }
        //speaker.getVolume();
        speaker.volumeUp();
        //speaker.getVolume();

        for(int i = 0; i < 100 ; i++){
            speaker.volumeDown();
        }

        speaker.volumeDown();
    }
}
