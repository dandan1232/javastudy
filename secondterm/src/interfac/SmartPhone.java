package interfac;

public class SmartPhone implements Telephone {

    public SmartPhone() {
    }
    @Override
    public void call() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("通过语音发信息");
    }

}

