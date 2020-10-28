package inherit;

public class Manager extends GeneralStaff {
    private double stack;//股权

    public double getStack() {
        return stack;
    }

    public void setStack(double stack) {
        this.stack = stack;
    }

    public Manager() {
    }

    public Manager(String name, int age, String sex, int daySalary, String position, int subsidies, double stack) {
        super(name, age, sex, daySalary, position, subsidies);
        this.stack = stack;
    }

    @Override
    public void printlncomebyMonth() {

        super.printlncomebyMonth();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("该经理获得的股权份额为：" + this.stack);
    }
}
