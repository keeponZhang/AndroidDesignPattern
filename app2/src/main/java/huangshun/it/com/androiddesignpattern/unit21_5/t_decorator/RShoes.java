package huangshun.it.com.androiddesignpattern.unit21_5.t_decorator;

import android.util.Log;

public class RShoes extends Decorator {
    public RShoes(Person person) {
        super(person);
    }

    @Override
    public void show() {
        super.show();
        Log.e(TAG, "show: 穿鞋子");
    }

    public void other(){
        Log.e(TAG, "other: 其他的功能");
    }
}
