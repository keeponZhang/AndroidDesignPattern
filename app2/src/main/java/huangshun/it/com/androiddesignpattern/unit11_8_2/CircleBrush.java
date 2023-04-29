package huangshun.it.com.androiddesignpattern.unit11_8_2;

import android.graphics.Path;

/**
 * 圆点画笔
 * Created by hanks on 15-12-18.
 */
public class CircleBrush implements IBrush {

    private int radius = 10;

    @Override public void down(Path path, float x, float y) {
        path.moveTo(x, y);
    }

    @Override public void move(Path path, float x, float y) {

        path.addCircle(x, y, radius, Path.Direction.CCW);
    }

    @Override public void up(Path path, float x, float y) {

    }
}
