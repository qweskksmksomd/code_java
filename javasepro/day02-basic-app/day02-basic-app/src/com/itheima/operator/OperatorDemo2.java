package com.itheima.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a=10;
        int b=a++;
        System.out.println(b);
        System.out.println(a);
        int c=10;
        int d=5;
        int rs3=c++ + ++c - --d - ++d +1 +c--;
        System.out.println(rs3);
    }
}
