package interfac;

public class CommonHandset extends Handset implements PlayWiring{

    @Override
    public void sendInfo() {
        super.sendInfo();
        System.out.println("开始发送文字信息");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("开始打电话");
    }

    @Override
    public void info() {
        System.out.println("这款手机的型号为："+this.getBrand()+this.getType());
    }

    public CommonHandset(String brand, String type) {
        super(brand, type);
    }

    public CommonHandset() {
    }

    @Override
    public void play(String incontent) {
        System.out.println("开始播放歌曲");
    }
}
