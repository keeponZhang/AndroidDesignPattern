package huangshun.it.com.androiddesignpattern.unit18_5.v1;

import huangshun.it.com.androiddesignpattern.unit18_5.v1.Lawyer;
import huangshun.it.com.androiddesignpattern.unit18_5.v1.XiaoMin;

/**
 * Created by hs on 2017/8/14.
 */

public class Test18 {
    public static void main(String[] args) {
        Lawyer lawyer = new Lawyer(new XiaoMin());
        lawyer.submit();
        lawyer.burden();
        lawyer.defend();
        lawyer.finish();
    }
}
