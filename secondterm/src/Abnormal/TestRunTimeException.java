package Abnormal;

import java.util.Scanner;

public class TestRunTimeException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
            int num1 = in.nextInt();

            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            if (num2==0){
                throw new RuntimeException("这个异常不处理，我看一下是否可以");
            }
            System.out.println("商为："+num1/num2);
        System.out.println("感谢使用本程序！");
        }

    }
