package huangshun.it.com.androiddesignpattern.unit11_5.teterimachine;

import huangshun.it.com.androiddesignpattern.unit11_5.teterimachine.v1.TetriMachine;

/**
 * Created by hanks on 15-12-18.
 */
public class RightCommand implements Command {
    TetriMachine tetriMachine;

    public RightCommand(TetriMachine tetriMachine) {
        this.tetriMachine = tetriMachine;
    }

    @Override public void executed() {
        tetriMachine.toRight();
    }
}
