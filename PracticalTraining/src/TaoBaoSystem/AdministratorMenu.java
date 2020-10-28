package TaoBaoSystem;

import java.util.Scanner;

public class AdministratorMenu {
    Scanner scan=new Scanner(System.in);
    public void Admin(){
        int Menu=1;
        System.out.println("**************************");
        System.out.println("\t1 删除商品信息");
        System.out.println("\t2 添加商品信息");
        System.out.println("\t3 修改商品信息");
        System.out.println("\t4 查询商品信息");
        System.out.println("\t0 返回上一级菜单");
        do{
            Menu=scan.nextInt();
            switch (Menu){
                case 1:
                    System.out.println("请输入删除商品信息");
                    break;
                case 2:
                    System.out.println("请输入添加商品信息");
                    break;
                case 3:
                    System.out.println("请输入修改商品信息");
                    break;
                case 4:
                    System.out.println("请输入查询商品信息");
                    break;
                case 0:
                    System.out.println("返回上一级菜单");
                    break;
                default:
                    System.out.println("输入有误，请输入一个0-4之间的数字");
                    break;

            }
        }while (Menu!=0);
    }
}
