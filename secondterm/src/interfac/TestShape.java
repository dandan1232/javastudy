package interfac;

public class TestShape {
    public static void main(String[] args) {
        Circular cir=new Circular(3.0);
        cir.getArea();
        cir.getCircumference();
        System.out.println("--------------------");

        Square square=new Square(3.0);
        square.getArea();
        square.getCircumference();
        System.out.println("-----------------------");

        Triangle tri=new Triangle(2.0);
        tri.getArea();
        tri.getCircumference();
    }
}
