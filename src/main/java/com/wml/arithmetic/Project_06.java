package com.wml.arithmetic;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/5 - 11 - 05 - 13:01
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_06 {
    public static class RangeSum2{
        //(L,R)
        private int[] preSum;
        public RangeSum2(int[] array){
            int N = array.length;
            preSum = new int[N];
            preSum[0] = array[0];
            for (int i = 1; i < N; i++) {
                preSum[i] = preSum[i-1]+array[i];
            }
        }
        public int rangeSum(int L , int R){
            return L == 0 ? preSum[R] : preSum[R]-preSum[L-1];
        }
        //这是一个main方法，是程序的入口：
        public static void main(String[] args) {
            int[] array = {3,4,6,1,8,3,9,3,7,0,6};
            int L = 4;
            int R = 6;
        }
    }
}
