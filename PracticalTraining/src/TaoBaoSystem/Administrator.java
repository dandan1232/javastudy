package TaoBaoSystem;

import java.util.Scanner;

public class Administrator {
    Scanner scan = new Scanner(System.in);

    public void Admins() {
        System.out.println("请输入管理员用户名：");
        while (true) {
            String name = scan.next();
            if (name.equals("guanliyuan"))
            break;
              else
            System.out.println("用户名错误，请重新输入用户名：");
        }
        System.out.println("请输入密码：");
        while (true) {
            String name = scan.next();
            if (name.equals("123"))
                break;
            else System.out.println("密码错误，请重新输入密码：");
        }
        System.out.println("管理员：guanliyuan 欢迎您的登录");

    }
}

