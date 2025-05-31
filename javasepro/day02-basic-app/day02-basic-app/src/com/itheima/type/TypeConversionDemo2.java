package com.itheima.type;

public class TypeConversionDemo2 {
    public static void main(String[] args) {
        char ch='0';
        byte a=10;
        int b=20;
        long c=30;
        long rs=a+b+c+ch;
        System.out.println(rs);
       double rs2= a+b+1.0;
       System.out.println(rs2);

       byte i=10;
       short j=20;
       int rs3=i+j;
        System.out.println(rs3);

    }
}
