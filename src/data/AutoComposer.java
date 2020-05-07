package data;

import logic.Composeable;
import logic.Playable;

import java.util.Random;

public class AutoComposer implements Composeable {

    private int[] listOfSounds;
    private final static int MIN_FREQUENCY = 30;
    private final static int MAX_FREQUENCY = 20000;
    Playable synthetiser;

    public AutoComposer(int numberOfSounds) {
        this.synthetiser = new Synthesizer();
        listOfSounds = new int[numberOfSounds];
        compose();
    }

    @Override
    public void compose() {
        for(int i=0; i<listOfSounds.length; i++){
            listOfSounds[i] = generateRandomFrequency();
        }
    }

    private int generateRandomFrequency(){
        Random generator = new Random();
        return generator.nextInt((MAX_FREQUENCY - MIN_FREQUENCY) + 1) + MAX_FREQUENCY;
    }

    public void playMelody() throws InterruptedException {
        for(int sound: listOfSounds){
            synthetiser.play(sound);
        }
    }


}
