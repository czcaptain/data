package com.yin.list;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        数组扩容 s = new 数组扩容(8);
        for(int i =0; i < 10; i++) {
            s.add(i) ;
        }
        for(int i =0; i < 10; i++) {
            System.out.println(s.getData(i));
        }
    }

}
