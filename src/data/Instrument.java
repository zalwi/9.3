package data;

import logic.Playable;
import logic.SoundUtils;

import javax.sound.sampled.LineUnavailableException;

abstract class Instrument implements Playable {
    @Override
    public void play(int freq) throws InterruptedException {
        try {
            SoundUtils.tone(freq,500);
            Thread.sleep(100);

        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }
}
