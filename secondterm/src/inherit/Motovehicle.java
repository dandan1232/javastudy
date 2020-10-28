package inherit;

public abstract class Motovehicle {
    private String brand;

    public Motovehicle (){

    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {

        this.brand = brand;
    }
    public Motovehicle(String brand){
        super();
        this.brand=brand;
    }

    public abstract  int calcRent(int days);
}
