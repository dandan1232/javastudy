package interfac;

public class UDisk implements USBInterface {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public UDisk(String brand) {
        this.brand = brand;
    }

    @Override
    public void service() {
            System.out.println("USB接口数据发送中......");
        }
    }
