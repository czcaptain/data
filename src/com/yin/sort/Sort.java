package com.yin.sort;

import java.util.ArrayList;
import java.util.Arrays;



public class Sort {


    public static void printList(int[] a) {

        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    // 冒泡
    public static void bubbleSort(int a[], int n) {

        if (n <= 1) {
            return;
        }
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true; // 有数据交换
                }
            }
            if (!flag) {
                break;
            }
        }
        printList(a);
    }




    // 插入
    public static void insertSort(int a[],int n) {
              if(n <= 1) {
                  return;
              }
        for (int i = 1; i < n; ++i) {
            int val = a[i];
            int j = i - 1;
            for (; j >= 0; --j) {
                if (a[j] > val) {
                    a[j + 1] = a[j]; //移动元素
                } else {
                    break;
                }
            }
            a[j+1] = val ;
        }
        printList(a);
    }


    //二分
    public static int bSearch(int a[], int n,int val) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if(val == a[mid]) {
                return mid;
            }else if(val > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }


    //快排







}
