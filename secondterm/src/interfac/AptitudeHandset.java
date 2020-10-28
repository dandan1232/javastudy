package interfac;

public class AptitudeHandset extends Handset implements Network,TakePictures {
    @Override
    public void netWorkConn() {
        System.out.println("已经开启5G网络");
    }

    @Override
    public void takePicture() {
        System.out.println("咔嚓——————照相成功");
    }

    @Override
    public void sendInfo() {
        System.out.println("已发送彩照");
    }

    @Override
    public void call() {
        System.out.println("开始给小石同学发起视频通话");

    }

    @Override
    public void info() {
        System.out.println("这款手机的型号是："+this.getBrand()+this.getType());
    }

    public AptitudeHandset(String brand, String type) {
        super(brand, type);
    }

    public AptitudeHandset() {
        super();
    }
}
