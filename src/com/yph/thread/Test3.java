package com.yph.thread;

import java.util.concurrent.CountDownLatch;

/**
 * 闭锁测试
 */
public class Test3 {
    private static final int NUM = 10;

    public static void main(String[] args) {
        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(NUM);

        for (int i = 0; i < NUM; i++) {
            new Thread(() -> {
                try {
                    startLatch.await();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    endLatch.countDown();
                }
            }).start();
        }

        startLatch.countDown();
        long start = System.currentTimeMillis();
        try {
            endLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            long end = System.currentTimeMillis();
            System.out.println(String.format("start:%d, end:%d, result:%d", start, end, end - start));
        }
    }


}
