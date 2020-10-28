package interfac;

public class FlashDrive implements USB {//U盘
    @Override
    public void insert() {
        System.out.println("检测到U盘接入，请稍等...");
    }

    @Override
    public void start() {
        System.out.println("正在读取U盘中的存储内容......");
    }

    @Override
    public void end() {
        System.out.println("U盘已安全拔出，数据尚未丢失。");
    }
}
