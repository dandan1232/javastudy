package interfac;

public class CellPhone implements Telephone {
    public  CellPhone(){
    }
    @Override
    public void call() {
        System.out.println("通过键盘打电话");
    }
    @Override
    public void sendMessage() {
        System.out.println("通过键盘发信息");
    }
}
