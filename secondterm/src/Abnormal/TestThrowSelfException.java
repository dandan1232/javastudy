package Abnormal;

import java.util.Scanner;
public class TestThrowSelfException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");

        try{
            int num1 = in.nextInt();

            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            if (num2==0){
                NotZeroSelfException nzsx=new NotZeroSelfException("林某人自己定义的有名异常");
                nzsx.setDevidedNum(num1);
                throw nzsx;
            }
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));
        }catch(NotZeroSelfException ex){
            System.out.println("程序运行时发现异常，并成功捕获了！");
            System.out.println("被除数："+ex.getDevidedNum());
            ex.printStackTrace();
        }finally{
            System.out.println("计算商的过程到此完成");
        }

        System.out.println("感谢使用本程序！");
    }
}
