package TaoBaoSystem;

import java.util.Scanner;

public class AddGoods {


    public static int add() {

        int Number;
        String name;
        double weight;
        double unitprice;
        while (true) {
            System.out.print("待输入记录的编号（输入“-1”）退出：");
            Scanner in= new Scanner(System.in);
            int num = in.nextInt();
            if (num != -1) {
                System.out.print("  *编号：");
                int No= in.nextInt();
                System.out.print("  *名称：");
                name = in.next();
                System.out.print("  *重量：");
                weight = in.nextDouble();
                System.out.print("  *单价: ");
                unitprice = in.nextDouble();
                System.out.print("  *数量：");
                Number = in.nextInt();
                    System.out.print("数据溢出！");
                    return -2;
        }
    }
}}
