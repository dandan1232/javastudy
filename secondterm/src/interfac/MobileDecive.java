package interfac;

public class MobileDecive implements USB{//移动硬盘
    @Override
    public void insert() {
        System.out.println("已检测到移动硬盘设备接入,系统正在检测其安全性...");
    }

    @Override
    public void start() {
        System.out.println("正在准备移动硬盘：G盘");

    }

    @Override
    public void end() {
        System.out.println("移动硬盘已经停止工作。");
    }
}
