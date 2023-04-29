package huangshun.it.com.androiddesignpattern.unit12_8.eventbus.handler;

import android.os.Handler;
import android.os.Looper;

import com.blend.androiddesignpattern.k_observer.eventbus.Subscription;

public class UIThreadEventHandler implements EventHandler {
    /**
     * ui handler
     */
    private Handler mUIHandler = new Handler(Looper.getMainLooper());
    /**
     *
     */
    DefaultEventHandler mEventHandler = new DefaultEventHandler();

    /**
     * @param subscription
     * @param event
     */
    public void handleEvent(final Subscription subscription, final Object event) {
        mUIHandler.post(new Runnable() {

            @Override
            public void run() {
                mEventHandler.handleEvent(subscription, event);
            }
        });
    }
}
