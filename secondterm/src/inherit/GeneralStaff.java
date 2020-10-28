package inherit;

public class GeneralStaff extends Employee {
    private String position;
    private int subsidies;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSubsidies() {
        return subsidies;
    }

    public void setSubsidies(int subsidies) {
        this.subsidies = subsidies;
    }

    public GeneralStaff() {

    }

    public GeneralStaff(String name, int age, String sex, int daySalary, String position, int subsidies) {
        super(name, age, sex, daySalary);
        this.position = position;
        this.subsidies = subsidies;
    }

    @Override
    public void printlncomebyMonth() {
        super.printlncomebyMonth();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("该员工职位为：" + this.position);
        System.out.println("该员工行政补贴为：" + this.subsidies);
    }


}
