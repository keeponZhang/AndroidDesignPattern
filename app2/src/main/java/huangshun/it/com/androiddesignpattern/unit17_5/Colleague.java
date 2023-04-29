package huangshun.it.com.androiddesignpattern.unit17_5;

/**
 * Created by hs on 2017/8/4.
 */

public abstract class Colleague {
    protected Mediator mMediator ;

    //抽象同事持有的是抽象中介
    public Colleague(Mediator mediator) {
        mMediator = mediator;
    }


}
