package threaddemo;

class SychroSellTicket2 implements Runnable {
    Integer ticket = 80;
    static String token = "abc";

    public SychroSellTicket2(String title) {
    }

    public SychroSellTicket2() {
    }

    public synchronized void sell() { //锁是this
        while (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":卖掉第" + (ticket--) + "张票");
        }
    }

    @Override
    public void run() {
        this.sell();
    }
}

public class Demo12_SychronizedMethodSellTicketByRunnable {
    public static void main(String[] args) {
        SychroSellTicket2 sell = new SychroSellTicket2();

        Thread win1 = new Thread(sell, "窗口1");
        win1.start();

        Thread win2 = new Thread(sell, "窗口2");
        win2.start();

        Thread win3 = new Thread(sell, "窗口3");
        win3.start();

    }
}
