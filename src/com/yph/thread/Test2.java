package com.yph.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test2 {

    private static final ExecutorService executorService = Executors.newFixedThreadPool(4);

    public static void main(String[] args) {

        executorService.execute(() -> {
            for (int i = 0; i < 1000; i++) {
                if (i == 100) {
                    executorService.shutdown();
                }
                System.out.println(i);
            }
        });


        try {
            boolean awaitTermination = executorService.awaitTermination(10, TimeUnit.SECONDS);
            System.out.println("-----------\n--------------\n------awaitTermination:" + awaitTermination);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
