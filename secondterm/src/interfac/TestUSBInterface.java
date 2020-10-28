package interfac;

public class TestUSBInterface {
    public static void main(String[] args) {
        USBInterface usb1=new UDisk("lenovo");
        usb1.service();
    }
}
