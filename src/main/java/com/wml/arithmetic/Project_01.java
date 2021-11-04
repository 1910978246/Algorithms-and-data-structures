package com.wml.arithmetic;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/2 - 11 - 02 - 23:20
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_01 {
    //位运算
    //函数
    public static void print(int num){
        //int num = 45623;  0 000000000000000101100100011011 1   左移就是num*2
        //1&1=1; 1&0=0; 0&1=0; 0&0=0;  左移有符号，右移不带符号。
        //32位数            0       ......                   31
        for(int i = 31;i>=0;i--){
            System.out.print((num & (1<<i))==0?"0":"1");
        }
        System.out.println();
    }
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        //有符号的int整型32位   long类型64位
        int num = -2;
        //int num = 1; 00000000000000000000000000000001 1<<31左移  10000000000000000000000000000000
        //int num = 2; 00000000000000000000000000000010
        //int num = 3; 00000000000000000000000000000011
        //int num = 4; 00000000000000000000000000000100
        //int num = 5; 00000000000000000000000000000101
        print(num);

        //整型的最大值、最小值
        int a = Integer.MAX_VALUE;//java是有符号整型  -2^31~0~2^31-1  c++是无符号 0~2^32-1  有符号的最大值比无符号最大值大
        int e = Integer.MIN_VALUE;
        //符号位是0---》非负数   符号位是1---》负数
        //int num = -1; 11111111111111111111111111111111   负数：取反加一
        System.out.println(a); //2147483647------>2^31-1
        System.out.println(e); //-2147483648------>-2^31
        print(a);  //01111111111111111111111111111111

        //最小
        int b = Integer.MIN_VALUE;
        print(b);//10000000000000000000000000000000

        int c = 456321;
        //取反
        int d = ~c;
        print(c);
        print(d);

        int f = 1567156;
        int g = 7516484;
        print(f);
        print(g);
        print(f | g);
        print(f & g);
        print(f ^ g);

        //右移
        int h = 1024;
        print(h);   //00000000000000000000010000000000
        print(h>>1);//00000000000000000000001000000000    系统最小数带符号右移拿符号位来补的，用0来补
        int l = Integer.MIN_VALUE;
        print(l);    //10000000000000000000000000000000
        print(l>>1); //11000000000000000000000000000000   系统最小数带符号右移拿符号位来补的，用1来补
        print(l>>>1);//01000000000000000000000000000000   系统最小数不带符号右移用0来补

        //取反
        int i = 5;
        //int j = -i;
        int j = (~i+1);//~N+1=N
        System.out.println(i);
        System.out.println(j);

        int k = -6;
        int m = (~k+1);
        System.out.println(k);
        System.out.println(m);
        print(k);
        print(m);

    }
}
