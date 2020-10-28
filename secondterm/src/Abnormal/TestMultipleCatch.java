package Abnormal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMultipleCatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入除数:");

        try {
            int num1 = in.nextInt();
            System.out.print("请输入被除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1 / num2));
        } catch (ArithmeticException aex) { //多重子类放上面
            System.out.println("程序运行时发现算术异常，并成功捕获了！");
        } catch (InputMismatchException ex) {
            System.out.println("程序运行时发现输入异常，并成功捕获了！");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("程序运行时发现其他异常，并成功捕获了！");
            ex.printStackTrace();
            //return;//return之前会查看一下有无finally代码块，有的话，先运行该代码块，然后再return
            System.exit(1);//强制终止
        } finally {
            System.out.println("计算商的过程到此完成");
        }
        System.out.println("感谢使用本程序！");
    }
}
