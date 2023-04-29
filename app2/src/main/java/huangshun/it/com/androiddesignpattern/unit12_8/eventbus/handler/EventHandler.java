package huangshun.it.com.androiddesignpattern.unit12_8.eventbus.handler;


import huangshun.it.com.androiddesignpattern.unit12_8.eventbus.Subscription;

public interface EventHandler {

    /**
     * 处理事件
     *
     * @param subscription 订阅对象
     * @param event 待处理的事件
     */
    void handleEvent(Subscription subscription, Object event);

}
