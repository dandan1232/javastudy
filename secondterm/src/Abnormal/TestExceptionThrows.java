package Abnormal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptionThrows {
    public static double divide() throws NotZeroSelfException, InputMismatchException {//上报
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = in.nextInt();
        System.out.print("请输入除数:");
        int num2 = in.nextInt();
        if (num2 == 0) {
            NotZeroSelfException nzsx = new NotZeroSelfException("我们自己定义的有名异常");
            nzsx.setDevidedNum(num1);
            throw nzsx;
        }
        return (double) num1 / num2;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
            divide();
        } catch (NotZeroSelfException ex) {
            System.out.println("程序运行时发现异常，并成功捕获了！");
            System.out.println("被除数为：" + ex.getDevidedNum());
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("计算商的过程到此完成");
        }

        System.out.println("感谢使用本程序！");
    }

}
