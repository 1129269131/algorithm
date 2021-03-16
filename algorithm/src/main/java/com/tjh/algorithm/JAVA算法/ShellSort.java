package com.tjh.algorithm.JAVA算法;

import org.junit.Test;

/**
 * 希尔排序
 * Create by koala on 2020-07-18
 */
public class ShellSort {

    public void shellSort(int[] a) {
        int dk = a.length / 2;
        while (dk >= 1) {
            ShellInsertSort(a, dk);
            dk = dk / 2;
        }
    }

    public void ShellInsertSort(int[] a, int dk) {
        //类似插入排序，只是插入排序增量是1，这里增量是dk，把1换成dk就可以了
        for (int i = dk; i < a.length; i++) {
            if (a[i] < a[i - dk]) {
                int j;
                int x = a[i]; //x为待插入元素
                a[i] = a[i - dk];
                for (j = i - dk; j >= 0 && x < a[j]; j = j - dk) {
                    //通过循环，逐个后移一位找到要插入的位置
                    a[j + dk] = a[j];
                }
                a[j + dk] = x; //插入
            }
        }
    }

    @Test
    public void test() {
        int[] arr = new int[]{3, 1, 0, 6, 9, 18};
        shellSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
