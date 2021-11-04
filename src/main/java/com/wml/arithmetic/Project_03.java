package com.wml.arithmetic;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/3 - 11 - 03 - 20:13
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_03 {
    //选择排序
    public static void SelectSort(int[] arr){
        //先想边界条件
        if(arr == null || arr.length < 2){
            return;
        }
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            //0 ~ n-1
            //1 ~ n-1
            //2 ~ n-1
            //i ~ n-1
            //找到最小值并找到位置
            int minValueIndex = i;//i
            for (int j = i+1; j < N; j++) {
                minValueIndex = arr[j] < arr[minValueIndex] ? j :minValueIndex;
            }
            //交换
            swap(arr,i,minValueIndex);
        }
    }
    //交换
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
    //打印数组
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //测试
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        int[] arr = {9,3,5,7,8,2,1,6,4};
        //没有排序数组
        printArray(arr);
        //排序
        SelectSort(arr);
        //打印排序数组
        printArray(arr);
    }
}
