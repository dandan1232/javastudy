package threaddemo;

class SychroSellTicket implements Runnable {
    Integer ticket = 80;
    static String token="abc";

    public SychroSellTicket(String title) {
    }

    public SychroSellTicket() {
    }

    @Override
    public void run() {
        synchronized (this) {
            while (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":卖掉第" + (ticket--) + "张票");
            }
        }
    }
}

public class Demo11_SychronizedSellTicketByRunnable {
    public static void main(String[] args) {
        SychroSellTicket sell = new SychroSellTicket();

        Thread win1 = new Thread(sell, "窗口1");
        win1.start();

        Thread win2 = new Thread(sell, "窗口2");
        win2.start();

        Thread win3 = new Thread(sell, "窗口3");
        win3.start();

    }
}
