package com.yph.design.command;

/**
 * 命令接口
 */
public interface Command {

    void execute();

    void undo();
}
