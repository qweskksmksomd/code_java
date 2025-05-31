package com.itheima.scanner;
import java.util.Scanner;
public class ScannerDemo1 {
    public static void main(String[] args) {
        //1.导包 自动导包
        //得到一个键盘扫描对象
        Scanner sc=new Scanner(System.in);
        //开始调用sc功能
        System.out.println("请输年龄");
        int age=sc.nextInt();//执行到这会开始等待用户输入一个整数，直到用户按了回车，才会拿到数据
        System.out.println("您的年龄是"+age);
        System.out.println("请输入名字");
        String name=sc.next();
        System.out.println(name+"欢迎进入系统");
    }
}
