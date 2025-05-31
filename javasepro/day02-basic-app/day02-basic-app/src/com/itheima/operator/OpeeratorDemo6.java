package com.itheima.operator;

public class OpeeratorDemo6 {
    public static void main(String[] args) {
        //三元运算符
        double score=58.5;
     String rs=   score>=60 ?"及格":"不及格";
        System.out.println(rs);
        //找出正数中较大值
        int a=50;
        int b=25;
        int max=a>b?a:b;
        System.out.println(max);
        //三个整数中的最大值
        int i=10;
        int j=20;
        int k=50;
        int temp=i>j?i:j;
        int max2=k>temp?k:temp;
        System.out.println(max2);
        System.out.println(10>3||10>3&&10<3);//&&高于||优先级
    }
}
