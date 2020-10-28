package inherit;

public class Car extends Motovehicle{
    private String type;

    public Car(){
        super();
    }

    public Car(String brand, String type) {
        super(brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public final int calcRent(int days) {
        int rentfee=0;
        if("商务舱".equals(this.type)&&"别克".equals(this.getBrand()))
        {
            rentfee=600*days;
        }else if ("550".equals(this.type)&&"宝马".equals(this.getBrand())){
            return rentfee=500*days;
        }else if ("林荫大道".equals(this.type)&&"别克".equals(this.getBrand())){
            return rentfee=300*days;
        }else{
            rentfee=0;
            System.out.println("输入错误");
        }
        return rentfee;
    }
}
