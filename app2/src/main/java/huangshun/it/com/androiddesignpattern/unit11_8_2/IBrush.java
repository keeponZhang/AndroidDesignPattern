package huangshun.it.com.androiddesignpattern.unit11_8_2;
import android.graphics.Path;

/**
 *
 * Created by hanks on 15-12-18.
 */
public interface IBrush {

    void down(Path path, float x , float y);
    void move(Path path, float x , float y);
    void up(Path path, float x , float y);
}
