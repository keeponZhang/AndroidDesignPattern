package huangshun.it.com.androiddesignpattern.unit17_5;

/**
 * Created by hs on 2017/8/4.
 */

public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator) {
        super(mediator);
    }

    public void soundPlay(String data) {
        System.out.println("音频:" + data);
    }
}
