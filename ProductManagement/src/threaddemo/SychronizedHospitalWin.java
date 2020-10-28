package threaddemo;

class SychroHospitalWin implements Runnable {
    Integer registration = 40;
    static String token = "abc";

    public SychroHospitalWin() {
    }

    public SychroHospitalWin(String title) {
    }

    public synchronized void sell() {
        while (registration > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "挂出第" + (registration--) + "个号");
        }
    }

    @Override
    public void run() {
        this.sell();
    }
}

public class SychronizedHospitalWin {
    public static void main(String[] args) {

        SychroHospitalWin sell = new SychroHospitalWin();

        Thread win = new Thread(sell, "窗口1");
        win.start();

        Thread win1 = new Thread(sell, "窗口2");
        win1.start();

        Thread win2 = new Thread(sell, "窗口3");
        win2.start();
    }
}
