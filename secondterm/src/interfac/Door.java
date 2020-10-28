package interfac;

public  abstract class Door {
    private String brand;

    public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
    }

    public Door(String brand) {
        this.brand = brand;
    }

    public Door() {
    }
    public abstract void open();
    public abstract void close();
}
