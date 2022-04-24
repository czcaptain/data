package com.yin.list;



/**
 * 数据动态扩容
 */
public class 数组扩容 {
    private int size;
    private int data[];
    public int getData(int i) {
        return data[i];
    }

    //默认大小10
    public 数组扩容() {
        this.size = 10 ;
        data = new int[10];
    }
    //申请大小
    public 数组扩容(int size) {
        this.size = size;
        data = new int[size];
    }

    //
    public boolean add(int element) {
        System.out.println(data.length);
        if(data.length == size) {
            System.out.println("数组大小已满");
            try {
                grow(element);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        data[data.length] =  element;
        return true;
    }

    public void grow(int element) throws Exception{
        System.out.println("扩容");
        int temp[] = new int[size*2];
        listCopy(temp);
        temp[size] = element;
        data = temp;
    }

    private void listCopy(int[] temp) {
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
    }

//    public void print() {
//        for (int i = 0; i < ; i++) {
//
//        }
//    }

}
