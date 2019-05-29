package com.yph.test.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIO {
    public static void main(String[] args) {
//        test();
//        test2();
        test3();
    }

    /**
     * 读写
     */
    public static void test() {
        FileChannel fc = null;
        try {
            // 写入
            fc = new FileOutputStream("data.txt").getChannel();
            fc.write(ByteBuffer.wrap("day day up".getBytes()));

            // 读写
            fc = new RandomAccessFile("data.txt", "rw").getChannel();
            fc.position(fc.size());
            fc.write(ByteBuffer.wrap("\ngood good study".getBytes()));

            // 读
            fc = new FileInputStream("data.txt").getChannel();
            // 分配
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            fc.read(buffer);
            // 做好使用准备
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            if (fc != null) {
                try {
                    fc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 文件复制1
     */
    public static void test2() {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in = new FileInputStream("data.txt").getChannel();
            out = new FileOutputStream("data3.txt").getChannel();
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (in.read(buffer) != -1) {
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Util.close(in);
            Util.close(out);
        }
    }

    /**
     * 文件复制2
     */
    public static void test3() {
        FileChannel in = null;
        FileChannel out = null;
        try {
            in = new FileInputStream("data.txt").getChannel();
            out = new FileOutputStream("data4.txt").getChannel();
            in.transferTo(0, in.size(), out);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            Util.close(in);
            Util.close(out);
        }
    }
}
