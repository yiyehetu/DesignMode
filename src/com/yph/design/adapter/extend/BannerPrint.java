package com.yph.design.adapter.extend;

import com.yph.design.adapter.Banner;

public class BannerPrint extends Banner implements Print {
    public BannerPrint(String name) {
        super(name);
    }

    @Override
    public void printApple() {
        showArrow();
    }

    @Override
    public void printPear() {
        showStar();
    }
}
