package inherit;

public final class Bus extends Motovehicle {

    private int seats;
    private String brand;


    public Bus() {
        super();
    }

    public Bus( String brand,int seats) {
        super();
        this.seats = seats;
        this.brand=brand;
    }

    public int getSeats() {
        return seats;
    }

    public final void setSeats(int seats) {
        this.seats = seats;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand=brand;
    }

    @Override
    public int calcRent(int days) {
        int rentfee=0;
        if("金龙".equals(this.brand)&&this.seats<=16){
            rentfee=days*800;
        }else if ( "金陵".equals(this.brand)&&this.seats>16){
             rentfee=days*1500;
        }
        return rentfee;
    }
}
