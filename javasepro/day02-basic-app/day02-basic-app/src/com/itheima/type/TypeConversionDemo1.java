package com.itheima.type;

public class TypeConversionDemo1 {
    public static void main(String[] args) {
        //理解自动类型转换
        byte a=12;
        int b=a;//发生了自动类型转换
        System.out.println(a);
        System.out.println(b);
        int c=100;
        double d=c;
        System.out.println(d);

        char ch='a';
        int i =ch;
        System.out.println(i);


    }
}
