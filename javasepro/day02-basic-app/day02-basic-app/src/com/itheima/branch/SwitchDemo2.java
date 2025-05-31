package com.itheima.branch;

/*switch执行方法流程*/
public class SwitchDemo2 {
    public static void main(String[] args) {
        String week = "1";
        switch (week) {
            case "1":
                System.out.println("学");
                break;
            case "2":
                System.out.println("请人帮忙");
                break;
            case "3":
                System.out.println("哈哈哈");
                break;
            default:
                System.out.println("您输入的不存在");
        }
    }
}
