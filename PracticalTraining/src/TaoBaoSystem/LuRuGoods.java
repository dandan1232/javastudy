package TaoBaoSystem;

import java.util.Scanner;

public class LuRuGoods {
Scanner scan=new Scanner(System.in);
    /**
     * @author Flobby
     * @version :1.0
     * @date :2019/12/24
     * @ClassName :商品管理
     */

    public static class GoodsManager {

        static int[] id = new int[11];
        static String[] name = new String[10];
        static double[] price = new double[10];
        static double[] quality = new double[10];


        //初始化
        public void Init() {
            for (int i = 0; i < 10; i++) {
                id[i] = i + 1;
                name[i] = null;
                price[i] = 0.0;
                quality[i] = 0;
            }
        }

        /**
         * 增加商品
         */
        public static void addGoods(){
            loop:
            for (int i = 0; i < 10; i++) {
                if (name[i] == null) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("现在已上架商品数目为: " + i + "，还有上架商品的空位有" + (10 - i) + "个");
                    System.out.println("现上架商品编号为：" + (i + 1));
                    System.out.println("请输入上架商品的名称：");
                    name[i] = scanner.next();
                    System.out.println("请输入上架商品的价格: ");
                    price[i] = scanner.nextDouble();
                    System.out.println("请输入上架商品的库存: ");
                    quality[i] = scanner.nextDouble();
                    System.out.println("继续上架商品-->1,结束上架-->0");
                    int a = scanner.nextInt();
                    if (a == 0) {
                        break loop;
                    }
                }
            }
        }

        /**
         * 展示商品信息
         */
        public static void showInformation() {
            loop:while (true) {
                System.out.println("编号 \t"+" 名称 "+"\t\t 单价 "+" \t 库存");
                for (int i = 0; i < 10; i++) {
                    System.out.printf("%-10s",(i+1)+ "\t\t " + name[i] + "\t " + price[i]+"\t "+quality[i]);
                    System.out.println(" ");
                }
                System.out.println("****************************");
                System.out.print("输入“0”退出：");
                Scanner out = new Scanner(System.in);
                int num = out.nextInt();
                if (num == 0) {
                    break loop;
                }
            }
        }

        /**
         * 删除商品
         */
        public static void deleteGoods() {
            Scanner scanner = new Scanner(System.in);
            loop:while (true) {
                System.out.print("请输入你想下架商品的编号: ");
                int outid = scanner.nextInt();
                name[outid - 1] = null;
                price[outid - 1] = 0.0;
                quality[outid - 1] = 0.0;
                System.out.println("****************************");
                System.out.print("输入“1”继续，输入“0”退出：");
                int num = scanner.nextInt();
                if (num == 0) {
                    break loop;
                }else{
                    continue loop;
                }
            }
        }

        /**
         * 查询库存
         */
        public static void modifyGoods() {
            String y = "abcsg";
            System.out.println(y);
        }

        /**
         * 查找商品
         */
        public static void searchGoods() {
            String u = "dvnci";
            System.out.println(u);

        }

        /**
         * 购买
         */
        public static void buyGoods() {
            double sum = 0;
            int[] paperid = new int[20];
            int[] papernum = new int[20];
            String[] papername = new String[20];
            double[] paperprice = new double[20];
            for (int j = 0; j < 20; j++) {
                paperid[j] = 0;
                papernum[j] = 0;
                papername[j] = "";
                paperprice[j] = 0.0;
            }
            int j = 0;
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("请输入商品编号：");
                int buyid = scanner.nextInt();
                System.out.print("请输入商品件数：");
                int num = scanner.nextInt();
                for (int i = 0; i < 10; i++) {
                    if (buyid == id[i]) {
                        sum = price[i] * num + sum;
                        System.out.println("");
                        System.out.println(name[i] + "已加入购物车 " + num + " 件");
                        paperid[j] = buyid;
                        papernum[j] = num;
                        papername[j] = name[i];
                        paperprice[j] = price[i];
                        j++;
                    }
                }
                System.out.println("");
                System.out.println("继续购买-->1,结束购买-->0");
                int a = scanner.nextInt();
                if (a == 0) {
                    System.out.println("*********************购物清单************************");
                    System.out.println("次序" + "\t商品名称" + "\t商品单价" + "\t商品个数");
                    j = 0;
                    while (paperid[j] != 0) {
                        System.out.println(+(j + 1) + " ." + "\t" + papername[j] + "\t\t" + paperprice[j] + "\t\t" + papernum[j]);
                        j++;
                    }
                    System.out.println("");
                    System.out.println("总计: " + sum);
                    System.out.println("**************************************************");
                    break;
                }
            }
        }


    }
}
