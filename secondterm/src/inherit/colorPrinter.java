package inherit;

public class colorPrinter extends Printer {

    @Override
    public void print(String content) {
        System.out.println("客户用彩色打印机打印的内容如下："+content+",打印时间5分钟。");
    }
}
