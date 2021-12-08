package com.wml.arithmetic;

/**
 * @Auther: 王明礼
 * @Date: 2021/11/7 - 11 - 07 - 13:58
 * @Description: com.wml.arithmetic
 * @version: 1.0
 */
public class Project_07 {
    //随机函数  Math.random() ------>返回double类型----->范围[0,1)----->等概率返回
    //这是一个main方法，是程序的入口：
    public static void main(String[] args) {
        System.out.println("随机函数测试等概率返回");
        int testTimes = 10000000;
        int count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (Math.random()<0.3){
                count++;
            }
        }
        System.out.println((double)count/(double)testTimes);
        System.out.println("---------------------------");

        //[0,1)------>[0,8)
        //将count归0  answer:解答 答复
        count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (Math.random()*8<4){
                count++;
            }
        }
        System.out.println((double)count/(double)testTimes);
        System.out.println("---------------------------");

        int k = 9;
        //[0,9)---->[0,8]
        //count[0] = 0次数  counts[1] = 1次数
        int[] counts = new int[k];
        for (int i = 0; i < testTimes; i++) {
            int ans = (int)(Math.random()*k);
            counts[ans]++;
        }
        for (int i = 0; i < k; i++) {
            System.out.println(i+"这个数，出现了"+counts[i]+"次");
        }
        System.out.println("---------------------------");
        count = 0;
        double x = 0.17;
        for (int i = 0; i < testTimes; i++) {
            if (xToxPower4() < x){
                count++;
            }
        }
        System.out.println((double)count/(double)testTimes);
        System.out.println(Math.pow(x,2));
        System.out.println(Math.pow(x,3));
        System.out.println((double)1 - Math.pow((double)1-x,2));
        System.out.println("---------------------------");
        count = 0;
        for (int i = 0; i < testTimes; i++) {
            if (f2() == 0){
                count++;
            }
        }
        System.out.println((double)count/(double)testTimes);
    }
    // 返回[0,1)的一个小数
    // 任意的x，x属于[0,1)，[0,x)范围上的数出现概率由原来的x调整成x平方
    public static double xToxPower2(){
        return Math.max(Math.random(), Math.random());
    }
    // 返回[0,1)的一个小数
    // 任意的x，x属于[0,1)，[0,x)范围上的数出现概率由原来的x调整成x立方
    public static double xToxPower3(){
        return Math.max(Math.random() ,Math.max(Math.random(), Math.random()));
    }
    // 返回[0,1)的一个小数
    // 任意的x，x属于[0,1)，[0,x)范围上的数出现概率由原来的x调整成x立方
    public static double xToxPower4(){
        return Math.min(Math.random(), Math.random());
    }

    //例子： 从1~5随机到1~7随机
    //lib里的，不能改。
    public static int f1(){
        return (int)(Math.random()*5)+1;//[1,6]
    }
    //随机机制，只能用f1
    //等概率返回0或1
    public static int f2(){
        int ans = 0;
        do {
            ans = f1();
        }while (ans == 3);
        return ans < 3 ? 0 : 1;
    }
    //例子：f函数0和1固定概率不是等概率  p返回0 1-p返回1   写出g函数返回等概率的0和1
    //只能知道，x会以固定概率返回0和1，但是x的内容看不到。
    public static int x(){
        return Math.random() < 0.84 ? 0 : 1;
    }
    //等概率返回0和1
    public static int y(){
        int ans = 0;
        do{
            ans = x();
        }while (ans == x());//ans:0 1   ans:1 0
        return ans;
    }
}
