package inherit;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        GeneralStaff gen = new GeneralStaff("张三", 20, "男", 300, "人事部秘书", 400);
        gen.printlncomebyMonth();
        gen.print();

        Manager man = new Manager("小红", 35, "女", 500, "总经理", 600, 0.05);
        man.printlncomebyMonth();
        man.print();
    }
}
