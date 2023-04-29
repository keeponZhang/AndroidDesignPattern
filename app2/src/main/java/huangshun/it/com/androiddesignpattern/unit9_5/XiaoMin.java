package huangshun.it.com.androiddesignpattern.unit9_5;

/**
 *
 * Created by hanks on 15-12-12.
 */
public class XiaoMin {
    public void main() {
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        groupLeader.nextLeader = director;
        director.nextLeader = manager;
        manager.nextLeader = boss;

        groupLeader.handleRequest(50000);
    }
}
