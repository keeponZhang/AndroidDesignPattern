package huangshun.it.com.androiddesignpattern.unit19_4;

import java.util.ArrayList;
import java.util.List;

public abstract class Dir {

    protected List<Dir> dirs = new ArrayList<>();

    protected String name;

    public Dir(String name) {
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public abstract void rmDir(Dir dir);

    public abstract void clear();

    public abstract void print();

    public abstract List<Dir> getFiles();

}
