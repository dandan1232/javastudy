import java.util.Scanner;
import java.util.Date;
import java.util.Scanner;

public class BuyGoods {
    /**
     * 将超市购物小票案例中，键盘录入部分封装为方法。 将switch语句完成的三个分支代码逻辑封装为3个方法
     * 当用户输入1时，让用户输入所要购买的商品数量
     * 当用户输入2时，给用户打印出对应的购物小票
     * 当用户输入3时，退出系统
     */
    public static class shopping {
        // 1.初始化系统
        // 定义商品
        static String sqsName = "石奇绅";// 商品名称
        static double sqsPrice = 4.50; // 商品单价
        static int sqsNumber = 0; // 商品数量
        static double sqsMoney = 0; // 商品金额
        static String jcxName = "金晨星";
        static double jcxPrice = 49.50;
        static int jcxNumber = 0;
        static double jcxMoney = 0;
        static String wfName = "王峰";
        static double wfPrice = 28.50;
        static int wfNumber = 0;
        static double wfMoney = 0;
        static String lddName = "林丹丹";
        static double lddPrice = 59.50;
        static int lddNumber = 0;
        static double lddMoney = 0;
        public static void main(String[] args) {
            // while循环，系统不退出一直运行
            while (true) {
                // 2.展示系统功能
                System.out.println("-------------欢迎来到桃饱网购物收银系统---------------");
                System.out.println("选择系统功能：1.输入购买商品数量         2.打印购物小票             3.退出系统");
                System.out.println("请输入功能编号进入功能：");
                // 3.获取用户键盘输入数据
                int buyGoods = getScanner();
                // 4.根据用户输入选择具体操作的功能
                switch (buyGoods) {
                    case 1:
                        buy();
                        break;
                    case 2:
                        print();
                        break;
                    case 3:
                        exit();
                        break;
                    default:
                        break;
                }
            }
        }
        /**
         * 获取键盘输入数字方法（选择功能） 返回值类型：int 方法名：getScanner 参数列表：空
         */
        private static int getScanner() {
            Scanner scan = new Scanner(System.in);
            int scanner = scan.nextInt();
            return scanner;
        }
        /**
         * 获取购买商品数量与计算价格 返回值类型：void 方法名：buy 参数列表：空
         */
        private static void buy() {
            System.out.println("请输入您购买" + sqsName + "的数量");
            sqsNumber = getScanner();
            System.out.println("请输入您购买" + jcxName + "的数量");
            jcxNumber = getScanner();
            System.out.println("请输入您购买" + wfName + "的数量");
            wfNumber = getScanner();
            System.out.println("请输入您购买" + lddName + "的数量");
            lddNumber = getScanner();
            // 计算每种商品的购买金额
            sqsMoney = sqsPrice * sqsNumber;
            jcxMoney = jcxPrice * jcxNumber;
            wfMoney = wfPrice * wfNumber;
            lddMoney = lddPrice *lddNumber;
        }
        /**
         * 打印小票方法 返回值类型：void 方法名：print 参数列表：空
         */
        private static void print() {
            // 商品种类
            int goodsItem = 4;
            // 商品数量
            int goodsNumber = sqsNumber + jcxNumber + wfNumber+lddNumber;
            // 商品金额
            double goodsMoney = sqsMoney + jcxMoney + wfMoney+wfMoney;
            // 打印小票
            System.out.println("----------------欢迎光临--------------");
            System.out.println("商品名称\t单价\t数量\t金额\t");
            System.out.println(sqsName + "\t\t"+sqsPrice + "\t\t" + sqsNumber + "\t\t" +sqsMoney);
            System.out.println(jcxName + "\t\t" + jcxPrice + "\t" + jcxNumber + "\t\t" + jcxMoney);
            System.out.println(wfName + "\t\t" + wfPrice + "\t" + wfNumber + "\t\t" + wfMoney);
            System.out.println(lddName + "\t\t" + lddPrice + "\t" + lddNumber + "\t\t" + lddMoney);
            System.out.println("共消费了  " + goodsItem + "种商品   共计" + goodsNumber + "件");
            System.out.println("总共消费金额： " + goodsMoney);
            System.out.println("--------请凭小票到服务台换取发票----------");
            System.out.println("-----------------------------------------");
            System.out.println(new Date());//当前时间
        }
        /**
         * 退出系统方法 返回值类型：void 方法名：exit 参数列表：空
         */
        private static void exit() {
            System.out.println("程序结束，期待下次为您服务！");
            // 退出方法，结束正在运行的虚拟机，0表示正常退出
            System.exit(0);
        }
    }
}
