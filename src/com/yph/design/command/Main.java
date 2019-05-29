package com.yph.design.command;

/**
 * 命令者模式
 * 将命令发布者与执行者解耦
 */
public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.setCommand(new Command1());
        controller.click1();
        controller.click2();
        controller.click2();
        controller.click2();
        controller.click2();
        controller.click2();
        controller.click2();

        System.out.println("--------------------------------------------");

        controller.setCommand(new Command2());
        controller.click2();
        controller.click1();
    }
}
