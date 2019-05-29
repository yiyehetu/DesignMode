package com.yph.test.io;

import java.io.Closeable;
import java.io.IOException;

public class Util {

    public static void close(Closeable stream){
        if (stream != null){
            try {
                stream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
