package inherit;

import java.util.Scanner;

public class MotovehicleTest {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("请输入你要租车的类型：1.轿车；2.客车");
        int cartype = scan.nextInt();
        if (cartype == 1) {
            System.out.println("请继续输入汽车的品牌：");
            String brand = scan.next();
            System.out.println("请继续输入汽车的型号：");
            String type = scan.next();
            System.out.println("请继续输入租车天数:");
            int days = scan.nextInt();
            Car car = new Car(brand, type);
            int rentfee = car.calcRent(days);
            System.out.println("品牌:" + car.getBrand());
            System.out.println("型号：" + car.getType());
            System.out.println("天数：" + days);
            System.out.println("总租金为：" + rentfee);
        } else {
            System.out.println("请继续输入客车的座位数：");
            int seats = scan.nextInt();
            System.out.println("请继续输入租车天数：");
            int days = scan.nextInt();
            Bus bus = new Bus(seats);
            int rentfee = bus.calcRent(days);
            System.out.println("座位数：" + seats);
            System.out.println("天数：" + days);
            System.out.println("总租金为：" + rentfee);
        }*/

        Motovehicle[]motos=new Motovehicle[5];
        motos[0]=new Car("别克","商务舱");
        motos[1]=new Car("宝马","550");
        motos[2]=new Car("别克","林荫大道");
        motos[3]=new Bus("金龙",16);
        motos[4]=new Bus("金陵",36);
        for (int i=0;i<motos.length;i++){
            System.out.println(motos[i].getBrand()+"五天的租金为："+motos[i].calcRent(5));
        }
        int allrentfee=calcTotalRent(motos,5);
        System.out.println("--------------------------");
        System.out.println("五辆车的总租金为："+allrentfee);
    }

    public static int calcTotalRent(Motovehicle[] motos, int days) {
        int totalrent = 0;
        for (Motovehicle moto : motos) {
            totalrent += moto.calcRent(days);
        }
        return totalrent;
    }
}

