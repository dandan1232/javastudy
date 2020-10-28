package threaddemo;

import java.util.Random;

class MYThread extends Thread {
    @Override
    public void run() {
        super.run();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() + "生成的第" + i + "个随机数" + random.nextDouble());
        }
    }
}

public class Demo02_ThreadPriority {

    public static void main(String[] args) {
        MYThread myth = new MYThread();
        myth.setName("我的线程1");
        myth.setPriority(8);  //最大10，最小1
        myth.start();

        MYThread myth2 = new MYThread();
        myth2.setName("我的线程2");
        myth2.setPriority(1);
        myth2.start();
    }
}
