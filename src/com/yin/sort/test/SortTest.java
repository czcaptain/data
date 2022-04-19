package com.yin.sort.test;
import com.yin.sort.Sort;

public class SortTest {

    public static void main(String[] args) {
        int a [] = {1 , 6 , 3 , 10 , 9 };
//        Sort.bubbleSort(a,5);
//        Sort.printList(a);
        Sort.insertSort(a,5);
        int i = Sort.bSearch(a, 5, 10);
        System.out.println(i);
    }
}
