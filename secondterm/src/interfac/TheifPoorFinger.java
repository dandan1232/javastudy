package interfac;

public class TheifPoorFinger extends Door implements LockFingerprint,Bell{
    public TheifPoorFinger(String brand) {
        super(brand);
    }

    @Override
    public void takePicture() {
        System.out.println(this.getBrand()+"检测到有人在门前，就先拍照");
    }


    @Override
    public void lockup() {

    }

    @Override
    public void openlock() {
        System.out.println(this.getBrand()+"插入钥匙后，锁开了");
    }

    @Override
    public void open() {
    }

    @Override
    public void close() {

    }

    @Override
    public void openByFingerprint() {
        System.out.println(this.getBrand()+"按上正确指纹后，锁开了");
    }
}
