package interfac;

public class Triangle implements Shape{ //等边三角形
    private double sideTriangle;

    public double getSideTriangle() {
        return sideTriangle;
    }

    public void setSideTriangle(double sideTriangle) {
        this.sideTriangle = sideTriangle;
    }

    public Triangle(double sideTriangle) {
        this.sideTriangle = sideTriangle;
        System.out.println("三角形的周长为："+this.getCircumference());
        System.out.println("三角形的面积为："+this.getArea());


    }
    public  Triangle(){

    }

    @Override
    public double getArea() {
        return Math.sqrt(3)/4*sideTriangle*sideTriangle;
    }

    @Override
    public double getCircumference() {
        return 3*sideTriangle;
    }
}
