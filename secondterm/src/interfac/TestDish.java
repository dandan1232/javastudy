package interfac;

public class TestDish {
    public static void main(String[] args) {
        USB flash=new FlashDrive();
        flash.insert();
        flash.start();
        flash.end();
        System.out.println("------------------------------");

        USB mobile=new MobileDecive();
        mobile.insert();
        mobile.start();
        mobile.end();
        System.out.println("--------------------------------");

        USB mouse=new Mouse();
        mouse.insert();
        mouse.start();
        mouse.end();
    }
}
