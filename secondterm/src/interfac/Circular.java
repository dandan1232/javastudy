package interfac;

public class Circular implements Shape { //圆形
    private double rad;

    public double getRad() {
        return rad;
    }

    public void setRad(double rad) {
        this.rad = rad;
    }

    public Circular(double rad) {
        this.rad = rad;
        System.out.println("圆形的周长为："+this.getCircumference());
        System.out.println("圆形的面积为："+this.getArea());
    }
    public Circular(){

    }

    @Override
    public double getArea() {
        return 3.14*rad*rad;
    }

    @Override
    public double getCircumference() {
        return 2*3.14*rad;
    }
}
