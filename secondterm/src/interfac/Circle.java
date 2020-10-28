package interfac;

public class Circle implements Picture {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Circle(String brand) {
        this.brand = brand;
    }

    public Circle() {

    }

    @Override
    public void show() {

    }
}
