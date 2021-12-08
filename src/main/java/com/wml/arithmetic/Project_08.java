package com.wml.arithmetic;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/7 - 11 - 07 - 13:58
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_08 {
    //对数器的使用，对数器：生产随机样本自己做比较的机器。 对数器是用来调bug的，不用依赖线上的测试。
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
    //i和j,数交换
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[j];
        arr[j] = arr[i];
        arr[i] = tmp;
    }

    //插入排序
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

    //返回一个数组arr, 数组的长度也是随机的,arr长度[0,maxLen-1],arr中的每一个值[0,maxVal-1]
    public static int[] lenRandomValueRandom(int maxLen,int maxVal){
        int len = (int)(Math.random()*maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int)(Math.random()*maxVal);
        }
        return ans;
    }
    //拷贝函数
    public static int[] copyArray(int[] arr){
        //新数组与被复制的数组的长度一样，每一个位置的值保持一致
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i]=ans[i];
        }
        return ans;
    }
    //验证两个数组:arr1和arr2一定等长  返回每个位置的值是否都一样
    public static boolean equalValues1(int[] arr1,int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
    //验证两个数组:arr1和arr2一定等长  返回每个位置的值是否都一样   思考：两个都相等不能都错吗？
    //验证是否有序的
    public static boolean isSorted(int[] arr){
       if (arr.length < 2){
            return true;
       }
       int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max > arr[i]){
                return false;
            }
            //更新max
            max = Math.max(max,arr[i]);
        }
        return true;
    }

    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        int maxLen = 50;
        int maxValue = 1000;
        int testTime = 10000;
        for (int i = 0; i < testTime; i++) {
            int[] arr1 = lenRandomValueRandom(maxLen,maxValue);
            //备份
            int[] tmp = copyArray(arr1);
            SelectSort(arr1);
            if (!isSorted(arr1)){
                //打印备份
                for (int j = 0; j < tmp.length; j++) {
                    System.out.println(tmp[j]+" ");
                }
                System.out.println();
                System.out.println("选择排序错了");
                break;
            }
        }
    }

}
