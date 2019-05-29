package com.yph.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test {

    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("1.txt");
            writer.println("lalalalalalal");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("this is hello");
    }
}
