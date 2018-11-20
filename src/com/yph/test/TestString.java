package com.yph.test;

import java.util.Arrays;

public class TestString {

    public static void main(String[] args) {
        String str1 = "1&2&3";
        String str2 = "123";
        String str3 = "1&";
        String str4 = "&2";
        String str5 = "&";
        String str6 = "";


        split(str1);
        split(str2);
        split(str3);
        split(str4);
        split(str5);
        split(str6);

    }

    static void split(String s){
        String[] split = s.split("&");
        System.out.println(s + "----------length:" + split.length);
        System.out.println(Arrays.toString(split));
        System.out.println("-------------------------------------------------------------");
    }
}
