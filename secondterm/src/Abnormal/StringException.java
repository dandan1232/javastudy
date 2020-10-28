package Abnormal;

import java.util.Scanner;

public class StringException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个字符串长度至少为3的值：");
        try {
            String num = scan.next();
            char s = num.charAt(2);
            System.out.println("您输入的字符串第三个字符为：" + s);
        } catch (Exception ex) {
            System.out.println("程序运行时发现异常，并成功捕获了！");
            ex.printStackTrace();
            System.exit(1);
        } finally {
            System.out.println("程序完成工作");
        }
        System.out.println("感谢使用本程序。");
    }
}
