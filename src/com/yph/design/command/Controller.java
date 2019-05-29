package com.yph.design.command;

public class Controller {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void click1() {
        command.execute();
    }

    public void click2() {
        command.undo();
    }
}
