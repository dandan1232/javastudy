package entity;
/*
 * 是业务层和DAO层共同协商定义的实体类，两层都会使用到。
*/

public class Product {

    private String name;
    private double price;
    private int num;
    private int type;

    public  Product(){

    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "["+this.id+","+this.name+","+this.price+","+this.num+","+this.type+"]";
    }
}
