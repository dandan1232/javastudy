package inherit;

public class blackPrinter extends Printer {

    @Override
    public void print(String content) {
        System.out.println("用黑白打印机打印的内容如下："+content+",打印时间3秒钟");
    }
}
