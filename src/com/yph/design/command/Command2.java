package com.yph.design.command;

public class Command2 implements Command {

    @Override
    public void execute() {
        System.out.println("command2 execute");
    }

    @Override
    public void undo() {
        System.out.println("command2 undo");
    }
}
