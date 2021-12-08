package com.wml.arithmetic;

import com.sun.org.apache.bcel.internal.generic.SWAP;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/4 - 11 - 04 - 22:41
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_05 {
    //插入排序：方法一
    public static void InsterSort1(int[] arr){
        if (arr==null || arr.length < 2){
            return;
        }
        //0 ~ 0 已经完成了
        //0 ~ 1
        //0 ~ 2
        //0 ~ 3
        //0 ~ n-1
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            //新数的位置
            int NewNumIndex = end;
            //while(end-1 >= 0 && arr[end-1] > arr[end]){
                //swap(arr,end-1,end);
            while(NewNumIndex-1 >= 0 && arr[NewNumIndex-1] > arr[NewNumIndex]){
                swap(arr,NewNumIndex-1,NewNumIndex);
                NewNumIndex--;
            }
        }
    }
    //插入排序：方法二
    public static void InsterSort2(int[] arr){
        if (arr==null || arr.length < 2){
            return;
        }
        int N = arr.length;
        for (int end = 1; end < N; end++) {
            //pre 当前数的前一个位置(新数的前一个位置) end-1   end
            for(int pre = end - 1;pre >= 0 && arr[pre] > arr[pre+1];pre++){
                swap(arr,pre,pre + 1);
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }
    public static void PrintArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {9,3,5,2,6,7,1,3,5,7,0};
        PrintArray(arr);
        InsterSort1(arr);
        PrintArray(arr);
        InsterSort2(arr);
        PrintArray(arr);
    }
}
