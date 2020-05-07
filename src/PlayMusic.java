import data.AutoComposer;
import logic.Composeable;

public class PlayMusic {
    public static void main(String[] args) throws InterruptedException {
        AutoComposer autoComposer = new AutoComposer(5);
        Composeable compositor = autoComposer;

        //Zagraj trzy melodie po 5 dźwięków
        for(int i=0;i<3;i++){
            System.out.println("Melodia nr: " + (i+1));
            //Generuj melodie
            compositor.compose();
            //Zagraj melodie
            autoComposer.playMelody();
        }
    }
}
