package com.wml.arithmetic;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/4 - 11 - 04 - 13:15
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_04 {
    //冒泡排序：两两换
    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length<2){
            return;
        }
        //0 ~ n-1
        //0 ~ n-2
        //0 ~ end
        int M = arr.length;
        //在那个范围做事
        for (int end = M-1; end >= 0; end--) {
            //执行 0 ~ end
            //0 1  1 2  2 3  3 4  end-1 end
            for (int second = 1; second <= end ; second++) {
                //具体怎么做
                if (arr[second-1] > arr[second]){
                    swap(arr,second-1,second);
                }
            }
        }
    }
    //i和j,数交换
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
        int[] arr = {9,5,3,6,1,2,0,4,7,8,6};
        PrintArray(arr);
        bubbleSort(arr);
        PrintArray(arr);
    }
}
