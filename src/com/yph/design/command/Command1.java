package com.yph.design.command;

public class Command1 implements Command {
    private Invoker1 invoker1 = new Invoker1();

    @Override
    public void execute() {
        invoker1.buy();
    }

    @Override
    public void undo() {
        invoker1.sale();
    }
}
