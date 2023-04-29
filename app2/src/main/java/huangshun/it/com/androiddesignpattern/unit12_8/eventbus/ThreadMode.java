package huangshun.it.com.androiddesignpattern.unit12_8.eventbus;

public enum ThreadMode {

    /**
     * 将事件执行在UI线程
     */
    MAIN,
    /**
     * 在发布线程执行
     */
    POST,
    /**
     * 将事件执行在一个子线程中
     */
    ASYNC

}
