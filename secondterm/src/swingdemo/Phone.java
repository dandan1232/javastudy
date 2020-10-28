package swingdemo;

public class Phone {
    private String brand;
    private int price;

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone(String brand) {
        super();
        this.brand = brand;
        this.price = 1000;
    }

    public Phone() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return this.brand + "手机，价格" + this.price;
    }
}
