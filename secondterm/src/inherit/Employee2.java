package inherit;

public abstract class Employee2 {
    private String name;
    private int age;
    private String sex;
    private double daysalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getDaysalary() {
        return daysalary;
    }

    public void setDaysalary(double daysalary) {
        this.daysalary = daysalary;
    }

    public Employee2(){

    }

    public Employee2(String name, int age, String sex, double daysalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daysalary = daysalary;
    }
    public void printlncomebyMonth(){
        System.out.println("----------------------");
        System.out.println("姓名为："+this.name);
        System.out.println("年龄为："+this.age+"岁");
        System.out.println("性别为："+this.sex);
        System.out.println("月薪为："+this.daysalary*30+"元");
    }

    public abstract void printlncomeFullYear();
}
