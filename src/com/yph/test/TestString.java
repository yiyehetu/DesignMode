package com.yph.test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {
        String str1 = "1&2&3";
        String str2 = "123";
        String str3 = "1&";
        String str4 = "&2";
        String str5 = "&";
        String str6 = "";


//        split(str1);
//        split(str2);
//        split(str3);
//        split(str4);
//        split(str5);
//        split(str6);

//        checkAllEmpty(null);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("aaaaaa");
//
//        System.out.println(list.contains("aaaaaa"));

        Integer integer = new Integer(11);
        System.out.println(integer == 11);

        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);

        System.out.println(integer1 == integer2);


        // -128~127
        Integer integer3 = 128;
        Integer integer4 = 128;
        System.out.println(integer3 == integer4);


    }

    static void split(String s) {
        String[] split = s.split("&");
        System.out.println(s + "----------length:" + split.length);
        System.out.println(Arrays.toString(split));
        System.out.println("-------------------------------------------------------------");
    }

    static boolean checkAllEmpty(String... args) {
        if (args == null) {
            return true;
        }
        for (String arg : args) {
            if (arg != null && arg.length() != 0) {
                return false;
            }
        }
        return true;
    }
}
