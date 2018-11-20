package com.yph.design.adapter.delegate;

import com.yph.design.adapter.Banner;

public class BannerPrint extends Print {
    private Banner banner;

    public BannerPrint(String name) {
        banner = new Banner(name);
    }

    @Override
    public void printApple() {
        banner.showArrow();
    }

    @Override
    public void printPear() {
        banner.showStar();
    }
}
