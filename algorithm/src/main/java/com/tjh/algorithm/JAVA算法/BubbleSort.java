package com.tjh.algorithm.JAVA算法;

import org.junit.Test;

/**
 * 冒泡排序算法
 * Create by koala on 2020-07-18
 */
public class BubbleSort {

    public int[] bubbleSort(int[] a, int n) {
        int i, j;
        for (i = 0; i < n; i++) { //表示n次排序过程
            for (j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) { //前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        return a;
    }

    @Test
    public void test() {
        int[] result = bubbleSort(new int[]{9, 1, 0, 6, 9, 18}, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
