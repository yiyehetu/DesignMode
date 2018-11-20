package com.yph.design.adapter;

public class Banner {
    private String name;

    public Banner(String name){
        this.name = name;
    }

    public void showArrow(){
        System.out.println("-->" + name + "<--");
    }

    public void showStar(){
        System.out.println("***" + name + "***");
    }
}
