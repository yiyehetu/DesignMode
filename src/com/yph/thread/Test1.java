package com.yph.thread;

import java.util.concurrent.Semaphore;

/**
 * 打印
 */
public class Test1 {

    public static void main(String[] args) {
        new Thread(new Print(), "A").start();
        new Thread(new Print(), "B").start();
        new Thread(new Print(), "C").start();
    }


    static class Print2 implements Runnable {
        static final Semaphore mSemaphore = new Semaphore(1);
        @Override
        public void run() {
            while (true) {
                try {
                    mSemaphore.acquire();
                    System.out.println(Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    mSemaphore.release();
                }
            }
        }
    }


    static class Print implements Runnable {
        static final Object sLock = new Object();
        static int mIndex = -1;

        @Override
        public void run() {
            while (true) {

                synchronized (sLock) {

                    String name = Thread.currentThread().getName();
                    final int threadIndex = getIndex(name);
                    if (mIndex == -1 || mIndex == threadIndex) {
                        System.out.println(name);
                        mIndex = (threadIndex + 1) % 3;
                        sLock.notifyAll();
                    } else {
                        // 不是要打印的线程
                        try {
                            sLock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        }


        int getIndex(String name) {
            switch (name) {
                case "A":
                    return 0;
                case "B":
                    return 1;
                case "C":
                    return 2;
                default:
                    return -1;
            }
        }
    }
}
