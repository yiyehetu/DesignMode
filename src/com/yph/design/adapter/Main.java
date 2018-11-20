package com.yph.design.adapter;

import com.yph.design.adapter.extend.BannerPrint;
import com.yph.design.adapter.extend.Print;

/**
 * 适配器模式适用于兼容旧代码，减少类的修改
 */
public class Main {

    public static void main(String[] args) {
        // 继承实现
        Print print = new BannerPrint("test");
        print.printApple();
        print.printPear();

        System.out.println("================================================================");
        // 代理实现
        com.yph.design.adapter.delegate.Print print2 = new com.yph.design.adapter.delegate.BannerPrint("test2");
        print2.printApple();
        print2.printPear();
    }
}
