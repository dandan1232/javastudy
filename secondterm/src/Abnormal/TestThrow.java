package Abnormal;

import java.util.Scanner;

public class TestThrow {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");

        try{
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            if (num2==0){
                throw new Exception("我们自定义异常，除数为0，不允许进行下面的计算");
            }
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));
        }catch(Exception ex){
            System.out.println("程序运行时发现异常，并成功捕获了！");
            ex.printStackTrace();
            //return;//return之前会查看一下有无finally代码块，有的话，先运行该代码块，然后再return
           // System.exit(1);
        }finally{
            System.out.println("计算商的过程到此完成");
        }

        System.out.println("感谢使用本程序！");
    }
}
