package com.wml.arithmetic;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/3 - 11 - 03 - 13:33
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_02 {
    //给定一个参数N，返回：  1! + 2! + 3! + 4! + … + N!   的结果
    public static long f1(int N){
        long ans = 0;
        for (int i = 1; i <= N ; i++) {
            ans += factorial(i);  //ans = ans +  factorial(i)
        }
        return ans;
    }
    public static long factorial(int N){
        long cur = 1;
        for (int i = 1; i <= N; i++) {  //i++ 先运算后加一 ，++1 先加一后运算。
            cur *= i;  //ans = ans * i
        }
        return  cur;
    }

    public static long f2(int N){
        long ans = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++) {
            cur = cur * i;
            ans += cur;
        }
        return  ans;
    }

    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        int N=10;
        System.out.println(f1(N));
        System.out.println(f2(N));
    }
}
