package inherit;

public class color3DPrinter extends colorPrinter {
    @Override
    public void print(String content) {
        System.out.println("用三维彩色打印机打印出如下内容："+content+",打印时间十分钟。");
    }
}
