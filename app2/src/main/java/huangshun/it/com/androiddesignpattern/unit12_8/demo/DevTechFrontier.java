package huangshun.it.com.androiddesignpattern.unit12_8.demo;

import java.util.Observable;


public class DevTechFrontier extends Observable {

    public void postNewPublication(String content){
        //标识状态或者内容发送改变
        setChanged();
        //通知所有的观察者
        notifyObservers(content);
    }

}
