package huangshun.it.com.androiddesignpattern.unit12_8.demo;

import android.support.annotation.NonNull;
import android.util.Log;


import java.util.Observable;
import java.util.Observer;


public class Coder implements Observer {

    protected static final String TAG = "Coder";

    private String name;

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Log.e(TAG, "更新name: " + name + "内容：" + arg);
    }

    @NonNull
    @Override
    public String toString() {
        return "码农" + name;
    }
}
