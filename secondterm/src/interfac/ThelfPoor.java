package interfac;

public class ThelfPoor extends Door implements Lock,Bell{


    public ThelfPoor(String brand) {
        super(brand);
    }

    public ThelfPoor() {
    }

    @Override
    public void open() {
        System.out.println(this.getBrand()+"门开了");
    }

    @Override
    public void close() {
        System.out.println(this.getBrand()+"门关了");

    }

    @Override
    public void lockup() {
        System.out.println(this.getBrand()+"上锁了");
    }

    @Override
    public void openlock() {
        System.out.println(this.getBrand()+"锁开了");
    }

    @Override
    public void takePicture() {
        System.out.println(this.getBrand()+"门铃响了,对焦拍照，拍照完成。");
    }
}
