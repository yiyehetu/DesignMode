package com.yph.thread.exector;

import java.util.Random;
import java.util.concurrent.Callable;

public class SimpleTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
