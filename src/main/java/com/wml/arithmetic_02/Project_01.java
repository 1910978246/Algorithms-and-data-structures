package com.wml.arithmetic_02;

import java.util.Arrays;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/10 - 11 - 10 - 9:22
 * @Description: com.wml.arithmetic_02
 * @version: 1.0
 */
public class Project_01 {
    //二分法
    //有序数组中找到num
    //有序数组中找到<=num最右的位置
    //局部最小值问题
    public static boolean find(int[] arr,int num){
        if (arr == null || arr.length == 0){
            return false;
        }
        int L = 0;
        int R = arr.length-1;
        while (L <= R){
            int mid = (L + R)/2;
           if (arr[mid] == num){
               return true;
           }else if (arr[mid] < num){
               L = mid + 1;
           }else{
               R = mid - 1;
           }
        }
        return false;
    }
    //有序数组中找到>=num最左的位置


    // for test对数器
    public static boolean test(int[] sortedArr, int num) {
        for (int cur : sortedArr) {
            if (cur == num) {
                return true;
            }
        }
        return false;
    }

    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {
        int testTime = 500000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr = generateRandomArray(maxSize, maxValue);
            Arrays.sort(arr);
            int value = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
            if (test(arr, value) != find(arr, value)) {
                System.out.println("出错了！");
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "Nice!" : "Fucking fucked!");
    }
}
