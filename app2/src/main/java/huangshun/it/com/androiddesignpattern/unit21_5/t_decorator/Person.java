package huangshun.it.com.androiddesignpattern.unit21_5.t_decorator;

public abstract class Person {

    static final String TAG = "Person";

    public String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public abstract void show();

}
