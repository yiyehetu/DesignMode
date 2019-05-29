package com.yph.test.io;

import java.io.*;

/**
 * 标准io测试
 */
public class StandrdIO {

    public static void main(String[] args) {
        test1();
    }

    public static void test1(){
        PrintStream out = System.out;
        out.println("this is system out");

        PrintStream err = System.err;
        err.println("this is system err");

        // 与以上两种输出区别
        InputStream in = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        System.out.println("请输入非空字符");
        String s;
        try {
            while ((s = br.readLine()) != null && s.length() != 0) {
                System.out.println(s);
                System.out.println("请输入非空字符");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
