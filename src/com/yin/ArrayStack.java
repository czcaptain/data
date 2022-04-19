package com.yin;

public class ArrayStack {
    private String [] items;
    private int count;
    private int n;

    public ArrayStack(int n) {
        items = new String[n];
        this.n = n;
        this.count = 0;
    }
    //入栈
    public boolean push(String item) {
        if(count == n ) {
            return false ; //栈满
        }
        items[count] = item;
        ++count;
        return true ;
    }
    //出栈
    public String pop() {
        if(count == 0) {
            return null; // 栈为空
        }
        return items[count-1];
    }
}
