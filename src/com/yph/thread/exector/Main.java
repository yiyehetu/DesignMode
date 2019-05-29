package com.yph.thread.exector;

import java.util.concurrent.*;

public class Main {

    private static final ExecutorService POOL = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws InterruptedException {
        POOL.submit(new SimpleTask());
        POOL.submit(new SimpleTask());
        POOL.submit(new SimpleTask());
        POOL.submit(new SimpleTask());
        POOL.submit(new LongTask());
        POOL.submit(new LongTask());
        POOL.submit(new LongTask());

//        POOL.shutdownNow();
//        while (!POOL.awaitTermination(1,TimeUnit.SECONDS)){
//            System.out.println("线程池未关闭");
//        }
//
//        System.out.println("线程池关闭");


        FutureTask<String> task = new FutureTask<String>(new LongTask()){
            @Override
            protected void done() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        POOL.execute(task);


//        try {
//            System.out.println(System.currentTimeMillis());
//            String s = task.get();
//            System.out.println(s);
//            System.out.println(System.currentTimeMillis());
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
    }
}
