package com.tjh.algorithm.JAVA算法;

import org.junit.Test;

/**
 * 插入排序
 * Create by koala on 2020-07-18
 */
public class InsertSort {

    public int[] insertSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            //插入的数
            int insertVal = arr[i];
            //被插入的位置(准备和前一个数比较)
            int index = i - 1;
            //如果插入的数比被插入的数小
            while (index >= 0 && insertVal < arr[index]) {
                //将arr[index]向后移动
                arr[index + 1] = arr[index];
                //让index向前移动
                index--;
            }
            //把插入的数放入合适位置
            arr[index + 1] = insertVal;
        }

        return arr;
    }

    @Test
    public void test() {
        int[] result = insertSort(new int[]{3, 1, 0, 6, 9, 18});
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
