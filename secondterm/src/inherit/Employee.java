package inherit;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private String sex;
    private int daySalary;


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

    public int getdaySalary() {
        return daySalary;
    }

    public void setdaySalary(int daySalary) {
    }

    public Employee() {
    }

    public Employee(String name, int age, String sex, int daysalary) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daySalary = daysalary;
    }

    public void print() {
    }

    public void printlncomebyMonth() {
        Scanner scan = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.println("请输入本月该职工上班天数：");
        int day = scan.nextInt();
        System.out.println("员工名字为：" + this.name);
        System.out.println("员工年龄为：" + this.age);
        System.out.println("员工性别为：" + this.sex);
        System.out.println("员工日薪为：" + this.daySalary);
        System.out.println("该员工的月薪为：" + this.daySalary * day);
    }
}
