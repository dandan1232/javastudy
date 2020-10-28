package interfac;

public class Mouse implements USB{//鼠标
    @Override
    public void insert() {
        System.out.println("鼠标已连接蓝牙，正在连接....");
    }

    @Override
    public void start() {
        System.out.println("鼠标已配置完成，可以使用了。");
    }

    @Override
    public void end() {
        System.out.println("鼠标已安全拔出。");
    }
}
