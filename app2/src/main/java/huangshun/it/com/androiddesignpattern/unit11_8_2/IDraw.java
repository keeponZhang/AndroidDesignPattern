package huangshun.it.com.androiddesignpattern.unit11_8_2;
import android.graphics.Canvas;

/**
 * 画图动作: 撤销,重做
 * Created by hanks on 15-12-18.
 */
public interface IDraw {

    void draw(Canvas canvas);
    void undo();
}

