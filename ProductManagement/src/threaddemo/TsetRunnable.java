package threaddemo;

class RunnableTest implements Runnable {

    @Override
    public void run() {
        for (int i = 2; i <= 100; i += 2) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

}

public class TsetRunnable {
    public static void main(String[] args) {
        RunnableTest rt = new RunnableTest();
        Thread th = new Thread(rt);
        th.setName("子线程输出数为（偶）：");
        th.start();

        for (int i = 1; i <= 100; i += 2) {
            System.out.println("主线程输出数为（奇）：" + i);
        }
    }
}
