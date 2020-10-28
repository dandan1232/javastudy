package inherit;

public class Manager2 extends Employee2 {
    private double stack;//股权

    public double getStack() {
        return stack;
    }

    public void setStack(double stack) {
        this.stack = stack;
    }

    public Manager2() {

    }

    public Manager2(String name, int age, String sex, double daysalary, double stack) {
        super(name, age, sex, daysalary);
        this.stack = stack;
    }

    @Override
    public void printlncomebyMonth() {
        super.printlncomebyMonth();
        System.out.println("总经理的股权份额为："+this.stack+"元");
    }

    @Override
    public void printlncomeFullYear() {
        System.out.println("总经理的年薪为："+(this.getDaysalary()*30*12+this.stack)+"元");
    }

}
