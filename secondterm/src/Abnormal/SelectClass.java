package Abnormal;

import java.util.Scanner;

public class SelectClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入课程编号（1~3之间的数字）：");
        try {
            int num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("JAVA课");
                        break;
                    case 2:
                        System.out.println("传统文化课");
                        break;
                    case 3:
                        System.out.println("高数课");
                }
            }catch (Exception ex) {
            System.out.println("编译有误，被发现");
            ex.printStackTrace();
            System.exit(1);
            //return; //return之前会检查有无finally代码块，有的话，先运行该代码块，然后再执行
        } finally {
            System.out.println("欢迎指正！");
        }
        System.out.println("已退出此程序");
    }
}
