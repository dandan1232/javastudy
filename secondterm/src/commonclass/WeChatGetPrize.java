package commonclass;

import java.text.DecimalFormat;
import java.util.Random;

public class WeChatGetPrize {
    public static void main(String[] args) {
        int[] weights = new int[40];//生成40个随机数
        double min = 0.01;
        double total = 50;
        Random rd = new Random(); //Random()的随机范围是[0,1),也就是有可能会生成零
        DecimalFormat df = new DecimalFormat("0.00");
        int sum = 0;
        for (int i = 0; i < weights.length; i++) { //设置“循环”，边界值是红包数-1
            weights[i] = rd.nextInt(50)+1; // 保证后面至少还有（weights-i）个最小金额可以发
            // 生成随机数范围为[0,50)也就是0~49,加1之后就变成1~50；
            sum += weights[i];
        }

        for (int i = 1; i < weights.length; i++) {
            double prize = Math.floor((double) weights[i] / (double) sum * 50.0 * 100) / 100;//×100÷100用途：最多小数出现两位
                total = total - prize;
                System.out.println("第" + i + "位同学抢到的金额为：" + prize + "元");
        }
        String last = df.format(total);
        System.out.println("最后一位同学抢到的金额为：" + last + "元");
    }
}