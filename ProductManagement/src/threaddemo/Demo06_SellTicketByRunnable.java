package threaddemo;

class SellTicket implements Runnable {
   static int ticket = 1;

    public SellTicket(String title) {
    }

    public SellTicket() {
    }

    @Override
    public void run() {
        while (ticket < 81) {
            System.out.println(Thread.currentThread().getName() + ":卖掉第" + (ticket++) + "张票");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo06_SellTicketByRunnable {
    public static void main(String[] args) {
        SellTicket sell = new SellTicket();

        Thread win1=new Thread(sell,"窗口1");
        win1.start();

        Thread win2=new Thread(sell,"窗口2");
        win2.start();

        Thread win3=new Thread(sell,"窗口3");
        win3.start();
    }
}
