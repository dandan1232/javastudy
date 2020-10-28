package interfac;

public class Handset {
    protected String play;
    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Handset(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public Handset() {

    }

    public void sendInfo() {

    }

    public void call() {

    }
    public void info(){

    }
}
