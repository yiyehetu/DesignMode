package com.yph.thread.exector;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class LongTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        return "success";
    }
}
