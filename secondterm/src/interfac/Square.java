package interfac;

public class Square implements Shape{ //正方形
    private double sideSquare;

    public double getSideSquare() {
        return sideSquare;
    }

    public void setSideSquare(double sideSquare) {
        this.sideSquare = sideSquare;
    }

    public Square(double sideSquare) {
        this.sideSquare = sideSquare;
        System.out.println("正方形的周长为："+this.getCircumference());
        System.out.println("正方形的面积为："+this.getArea());
    }
    public Square(){

    }

    @Override
    public double getArea() {
        return sideSquare*sideSquare;
    }

    @Override
    public double getCircumference() {
        return 4*sideSquare;
    }
}
